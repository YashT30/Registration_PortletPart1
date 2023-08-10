<%@ include file="./init.jsp" %>
<portlet:actionURL name="registerUser" var="registrationURL" />
<div class="registration-form">
    <aui:form action="<%= registrationURL %>" method="post">
        <aui:input label="First Name" name="firstName" maxLength="50" required="true" />
        <aui:input label="Last Name" name="lastName" maxLength="50" required="true" />
        <aui:input label="Email Address" name="emailAddress" type="email" maxLength="255" required="true" />
        <aui:input label="Username" name="username" minLength="4" maxLength="16" required="true" />
        <aui:fieldset label="Gender">
            <aui:input type="radio" label="Male" name="gender" value="male" required="true" />
            <aui:input type="radio" label="Female" name="gender" value="female" required="true" />
        </aui:fieldset>
        <aui:select label="Birthday Month" name="birthdayMonth" required="true">
            <aui:option value="">Select Month</aui:option>
            <aui:option value="1">January</aui:option>
            <aui:option value="2">February</aui:option>
            <aui:option value="3">March</aui:option>
            <!-- Add options for other months -->
        </aui:select>
        <aui:select label="Birthday Year" name="birthdayYear" required="true">
            <aui:option value="">Select Year</aui:option>
            <aui:option value="2020">2020</aui:option>
            <aui:option value="2021">2021</aui:option>
            <aui:option value="2022">2022</aui:option>
            <!-- Add options for other years -->
        </aui:select>
        <aui:input label="Password" name="password1" type="password" minLength="6" required="true" />
        <aui:input label="Confirm Password" name="password2" type="password" minLength="6" required="true" />
        <aui:input label="Home Phone" name="homePhone" type="tel" pattern="[0-9]{10}" />
        <aui:input label="Mobile Phone" name="mobilePhone" type="tel" pattern="[0-9]{10}" />
        <aui:input label="Address 1" name="address" maxLength="255" required="true" />
        <aui:input label="Address 2" name="address2" maxLength="255" />
        <aui:input label="City" name="city" maxLength="255" required="true" />
        <aui:input label="State" name="state" maxLength="2" required="true" />
        <aui:input label="Zip Code" name="zip" pattern="[0-9]{6}" required="true" />
        <aui:select label="Security Question" name="securityQuestion" required="true">
            <aui:option value="" selected="true" disabled="true">Select a security question</aui:option>
            <aui:option value="Mother's maiden name">What is your mother's maiden name?</aui:option>
            <aui:option value="First car">What is the make of your first car?</aui:option>
            <aui:option value="High school mascot">What is your high school mascot?</aui:option>
            <aui:option value="Favorite actor">Who is your favorite actor?</aui:option>
        </aui:select>
        <aui:input label="Answer" name="securityAnswer" maxLength="255" required="true" />
        <aui:input type="checkbox" label="I accept the <a href='/terms-of-use' target='_blank'>Terms of Use</a>" name="acceptedTermsOfUse" required="true" />
        <aui:button type="submit" value="Register" />
    </aui:form>
</div>