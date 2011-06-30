Entando Plugin Builder for ANT
==============================

The goal of this ANT script is to provide
an easy way to create and "empty" jAPS Entando plugin
and start working on it.

How to use it
-------------
Open the build.xml file and setup these two vars:

- newPluginName = jpmyplugin
- newPluginNameClass = Jpmyplugin
- Object = mypluginobject
- ObjectClass = MyPluginObject

Then use the <build> task with ANT. 