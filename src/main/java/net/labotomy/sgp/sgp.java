package net.labotomy.sgp;

import org.bukkit.plugin.java.JavaPlugin;
// Annotations Support to replace ORIGINALplugin.yml
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.*;
import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.java.annotation.dependency.*;
import org.bukkit.plugin.java.annotation.command.*;
import org.bukkit.plugin.java.annotation.permission.Permission;
import org.bukkit.plugin.java.annotation.permission.ChildPermission;
import org.bukkit.permissions.*;

// Annotations if you choose to use them instead of ORIGINALplugin.yml
@Plugin(name = "SGP", version = "0.1")
@Description("Simple Gradle Plugin project template")
@LoadOrder(PluginLoadOrder.POSTWORLD)
@Author("Xyreious")
@Website("www.spigotmc.org")
@LogPrefix("X-SGP")
@Library("com.squareup.okhttp3:okhttp:4.9.0")
@Dependency("WorldEdit")
@Dependency("Towny")
@LoadBefore("Towny")
@SoftDependency("EssentialsX")
@Commands(@Command(name = "foo", desc = "Foo command", aliases = {"foobar", "fubar"}, permission = "test.foo", permissionMessage = "You do not have permission!", usage = "/<command> [test|stop]"))
@Permission(name = "test.foo", desc = "Allows foo command", defaultValue = PermissionDefault.OP)
@Permission(name = "test.*", desc = "Wildcard permission", defaultValue = PermissionDefault.OP, children = {@ChildPermission(name ="test.foo")})
@ApiVersion(ApiVersion.Target.v1_18)

public class sgp extends JavaPlugin{
    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}
