package com.duy_pk;

import com.duypk.common.Basetest;

public class Locator {
    //Login CRM
    public static String LoginPageHeader = "//h1[normalize-space()='Login']";
    public static String InputEmail = "//input[@id='email']";
    public static String InputPassword = "//input[@id='password']";
    public static String Rememberbox = "//input[@id='remember']";
    public static String LoginButton = "//button[normalize-space()='Login']";
    public static String ForgotPasswordLink = "//a[normalize-space()='Forgot Password?']";

    //Dashboard
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuProjects = "//span[normalize-space()='Projects']";
    public static String menuTasks = "//span[normalize-space()='Tasks']";

    //Customers
    public static String AddNewCustomerButton = "//a[normalize-space()='New Customer']";
    public static String ImportCustomerButton = "//a[normalize-space()='Import Customers']";
    public static String ContactsButton = "//a[contains(@href,'clients/all_contacts')]";
    public static String CustomersPageHeader = "//span[normalize-space()='Customers Summary']";
    public static String InputCustomersSearch = "//div[@id='DataTables_Table_0_filter']//input[@type='search']";
//    public static String firstSearhCustomers = "//tr[@class='has-row-options odd']//td[@class='sorting_1']";
    public static String firstSearhCustomers = "//a[normalize-space()='" + Basetest.CompanyName + "']";

    //NewCustomer
    public static String InputCompanyName = "//input[@id='company']";
    public static String InputVATnumber = "//input[@id='vat']";
    public static String InputPhone = "//input[@id='phonenumber']";
    public static String InputWebsite = "//input[@id='website']";
    public static String DropdownGroups = "//button[@data-id='groups_in[]']";
    public static String InputSearchGroups = "//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String DropdownCurrency = "//button[@data-id='default_currency']";
    public static String InputSearchCurrency = "//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String DropdownLanguage = "//button[@data-id='default_language']";
    public static String OptionVietnamese = "//span[normalize-space()='Vietnamese']";
    public static String InputAddress = "//textarea[@id='address']";
    public static String InputCity = "//input[@id='city']";
    public static String InputState = "//input[@id='state']";
    public static String InputZipCode = "//input[@id='zip']";
    public static String DropdownCountry = "//button[@data-id='country']";
    public static String InputSearchCountry = "//div[@app-field-wrapper='country']//input[@type='search']";
    public static String SaveAndCreateContactButton = "//button[normalize-space()='Save and create contact']";
    public static String SaveCustomerButton = "//div[@id='profile-save-section']//button[normalize-space()='Save']";

    //Project List
    public static String NewProjectButton = "//a[normalize-space()='New Project']";
    public static String InputProjectSearch = "//div[@id='DataTables_Table_0_filter']//input[@type='search']";
    public static String ProjectHeader = "//span[normalize-space()='Projects Summary']";

    //NewProject
    public static String AddNewProjectHeader = "//h4[normalize-space()='Add new project']";
    public static String InputProjectName = "//label[normalize-space()='* Project Name']/following-sibling::input";
    public static String DropdownCustomer = "//label[@for='clientid']/following-sibling::div//button";
    public static String InputSearchCustomer = "//label[@for='clientid']/following-sibling::div//input[@type='search']";
    public static String CheckboxCaculateProgress = "//input[@id='progress_from_tasks']";
    public static String SliderProgress = "//label[contains(text(),'Progress')]/following-sibling::input[@name='progress']";
    public static String DropdownBillingType = "//label[normalize-space()='* Billing Type']/following-sibling::div//button";
    public static String OptionBillingType = "//span[normalize-space()='Project Hours']";
    public static String DropdownStatus = "//label[normalize-space()='Status']/following-sibling::div//button";
    public static String OptionStatus = "//span[normalize-space()='On Hold']";
    public static String InputTotalRate = "//label[normalize-space()='Total Rate']/following-sibling::input";
    public static String InputEstimatedHours = "//label[normalize-space()='Estimated Hours']/following-sibling::input";
    public static String DropdownMembers = "//label[normalize-space()='Members']/following-sibling::div//button[@data-toggle='dropdown']";
    public static String InputSearchMembers = "//label[normalize-space()='Members']/following-sibling::div//input[@type='search']";
    public static String InputStartDate = "//label[normalize-space()='* Start Date']/following-sibling::div//input";
    public static String InputDeadline = "//label[normalize-space()='Deadline']/following-sibling::div//input";
    public static String InputTag = "//label[normalize-space()='Tags']/following-sibling::ul//input";
    public static String InputDescription = "//body[@data-id='description']";
    public static String CheckboxSendProject = "//label[normalize-space()='Send project created email']/preceding-sibling::input";
    public static String SaveProjectButton = "//div[@class='panel-footer text-right']/child::button";

    //contact
    public static String menuContact = "//a[@data-group='contacts']";
    public static String contactHeader = "//h4[normalize-space()='Contacts']";
    public static String addNewContactButton = "//a[normalize-space()='New Contact']";
    public static String contactDialogHeader = "//h4[normalize-space()='Add new contact']";
    public static String profileImage = "//input[@id='profile_image']";
    public static String contactFirstNameInput = "//input[@id='firstname']";
    public static String contactLastNameInput = "//input[@id='lastname']";
    public static String contactPosition = "//input[@id='title']";
    public static String contactEmailInput = "//input[@id='email']";
    public static String contactGeneratePass = "//a[@class='generate_password']";
    public static String contactPassInput = "//input[@name='password']";
    public static String contactPassShow = "//i[@class='fa fa-eye']";
    public static String contactCheckboxDonotsend = "//input[@id='donotsendwelcomeemail']";
    public static String contactCheckboxSend = "//input[@id='send_set_password_email']";
    public static String contactSave = "//form[@id='contact-form']//button[normalize-space()='Save']";
    public static String contactSearch = "//div[@class='panel-body']//input[@type='search']";
    public static String contactedName = "//a[normalize-space()='"+Basetest.ContactFirstName+
            " "+Basetest.ContactLastName+"']";
}
