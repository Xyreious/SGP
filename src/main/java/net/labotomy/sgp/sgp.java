package net.labotomy.sgp;

import org.bukkit.plugin.java.JavaPlugin;

/*
Annotations if you choose to use them instead of plugin.yml
@Plugin(name = "TestPlugin", version = "1.0")
@Description("A test plugin")
@LoadOrder(PluginLoadOrder.STARTUP)
@Author("md_5")
@Website("www.spigotmc.org")
@LogPrefix("Testing")
@Library("com.squareup.okhttp3:okhttp:4.9.0")
@Dependency("WorldEdit")
@Dependency("Towny")
@LoadBefore("Towny")
@SoftDependency("EssentialsX")
@Commands(@Command(name = "foo", desc = "Foo command", aliases = {"foobar", "fubar"}, permission = "test.foo", permissionMessage = "You do not have permission!", usage = "/<command> [test|stop]"))
@Permission(name = "test.foo", desc = "Allows foo command", defaultValue = PermissionDefault.OP)
@Permission(name = "test.*", desc = "Wildcard permission", defaultValue = PermissionDefault.OP, children = {@ChildPermission(name ="test.foo")})
@ApiVersion(ApiVersion.Target.v1_13)
*/

public class sgp extends JavaPlugin{
    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}
