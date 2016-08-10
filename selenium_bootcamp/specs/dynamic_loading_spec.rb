require 'selenium-webdriver'
require_relative 'dynamic_loading_page_object'

describe 'Dynamic Loading' do
  before(:each) do
    @driver = Selenium::WebDriver.for :firefox
    @dynamic_loading = DynamicLoading.new(@driver)
  end

  after(:each) do
    @driver.quit
  end

  it 'Waited for Hidden Element' do
    @dynamic_loading.visit_example 1
    @dynamic_loading.start
    expect(@dynamic_loading.finish_text_present?).to eq(true)
  end

  it 'Waited for Element to Render' do
    @dynamic_loading.visit_example 2
    @dynamic_loading.start
    expect(@dynamic_loading.finish_text_present?).to eq(true)
  end
end