package com.qa.ewl.tests;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import java.util.*;
import java.util.regex.Pattern;

public class Example {
  public static void main(String[] args) throws InterruptedException {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://ewluat.azurewebsites.net/");
      page.navigate("https://ewluat.azurewebsites.net/app/dash/simple");
      page.navigate("https://ewluat.azurewebsites.net/unauth/login");
      page.getByPlaceholder("Username").click(new Locator.ClickOptions()
        .setModifiers(Arrays.asList(KeyboardModifier.CONTROL)));
      page.getByPlaceholder("Username").click();
      page.getByPlaceholder("Username").fill("kavita.khandelwal@edgewl.com");
      page.getByPlaceholder("Password").click(new Locator.ClickOptions()
        .setModifiers(Arrays.asList(KeyboardModifier.CONTROL)));
      page.getByPlaceholder("Password").fill("1_b?!?hG");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Bookings")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Booking List")).click();
      page.getByRole(AriaRole.BUTTON).filter(new Locator.FilterOptions().setHasText("plus_one")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Customer")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Customer")).fill("cle");
      page.getByText("CLE01 | CLELAND MCIVER LTD").click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Supplier")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Supplier")).fill("aj");
      page.getByText("AJEDGE | EWL").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("POL")).fill("a");
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^POL$"))).click();
      page.getByText("DKAAB | Aabenra").click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("POD")).fill("a");
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("POD")).click();
      page.getByText("DKAAL | Aalborg").click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Inco Term$"))).nth(3).click();
      page.getByText("FOB | FOB").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
      page.getByText("directions_boat0").click();
      Thread.sleep(3000);
      page.getByText("Add new").click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Vessel")).fill("a");
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Vessel$"))).click();
      page.getByText("AA0038").click();
      page.getByPlaceholder("Voyage").click();
      page.getByPlaceholder("Voyage").fill("sd");
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Carrier")).fill("a");
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Carrier")).click();
      page.getByText("ABC | AUSTRALIA BEAUTY CONNECTIONS").click();
      page.getByRole(AriaRole.TABPANEL, new Page.GetByRoleOptions().setName("Add new")).locator("#custom-control-6").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Open calendar")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("1 May 2023").setExact(true)).click();
      page.locator("mat-form-field").filter(new Locator.FilterOptions().setHasText("ETA")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Open calendar")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("7 May 2023").setExact(true)).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
      page.locator("mat-cell:nth-child(5) > .mat-form-field > .mat-form-field-wrapper > .mat-form-field-flex > .mat-form-field-infix").click();
      page.locator("#mat-input-65").fill("123432");
      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Item Details")).click();
      page.getByRole(AriaRole.BUTTON).filter(new Locator.FilterOptions().setHasText("plus_one")).click();
      page.getByPlaceholder("Order Number").click();
      page.getByPlaceholder("Order Number").fill("oredr");
      page.getByPlaceholder("Cbm").click();
      page.getByPlaceholder("Cbm").fill("1");
      page.getByPlaceholder("weight").click();
      page.getByPlaceholder("weight").fill("2");
      page.getByPlaceholder("Cartons").click();
      page.getByPlaceholder("Cartons").fill("3");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Send to SA")).click();
      page.getByText("Header Details").click();
      page.getByPlaceholder("LCL").dblclick();
      page.getByPlaceholder("LCL").fill("20");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Send to SA")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SA").setExact(true)).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Send to Agent")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Send to Agent")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm Booking")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm Booking")).click();
      page.getByRole(AriaRole.BUTTON).filter(new Locator.FilterOptions().setHasText("settings")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Convert to job (SI)")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Convert to job (SI)")).click();
    }
  }
}