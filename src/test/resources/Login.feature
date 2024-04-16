Feature: validating login functionality
#invalid invalid-> s1
#invalid valid-> s2
#valid valid-> s3
#valid invalid-> s4
#empty empty-> s5

Scenario: validating  login with invalid username and valid password
Given: user is on facebook page in chrome browser
When: user enter username and password
And: user enter login button
Then: user do validation
