require 'selenium-webdriver'
require_relative 'login'

describe 'Login' do
	
  before(:each) do
    @driver = Selenium::WebDriver.for :firefox
    @login = Login.new(@driver)
  end

  after(:each) do
    @driver.quit
  end

  it 'succeeded' do
    @login.with('tomsmith', 'SuperSecretPassword!')
    expect(@login.success_message_present?).to eq(true)
  end

  it 'failed' do
    @login.with('asdf', 'asdf')
    expect(@login.failure_message_present?).to eq(true)
  end
end