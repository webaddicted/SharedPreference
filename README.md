# SharedPreference

### Uses

Step 1: initialize Preference Class min application class.

    PreferenceUtil.init(getApplicationContext());
    
Step 2: set & get data from Preference Storage
    
    PreferenceUtil.getInstance().setPreference(NAME, "Deepak");
    Toast.makeText(this, ""+PreferenceUtil.getInstance().getPreference(NAME,"hi"), Toast.LENGTH_SHORT).show();

