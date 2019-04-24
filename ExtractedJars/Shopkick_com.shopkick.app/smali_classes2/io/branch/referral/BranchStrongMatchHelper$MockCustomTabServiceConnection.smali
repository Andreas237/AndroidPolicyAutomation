.class abstract Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;
.super Ljava/lang/Object;
.source "BranchStrongMatchHelper.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/BranchStrongMatchHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "MockCustomTabServiceConnection"
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/BranchStrongMatchHelper;


# direct methods
.method public constructor <init>(Lio/branch/referral/BranchStrongMatchHelper;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;->this$0:Lio/branch/referral/BranchStrongMatchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onCustomTabsServiceConnected(Landroid/content/ComponentName;Ljava/lang/Object;)V
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 9

    const/4 v0, 0x0

    .line 205
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;->this$0:Lio/branch/referral/BranchStrongMatchHelper;

    iget-object v1, v1, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsClientClass:Ljava/lang/Class;

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Class;

    iget-object v4, p0, Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;->this$0:Lio/branch/referral/BranchStrongMatchHelper;

    iget-object v4, v4, Lio/branch/referral/BranchStrongMatchHelper;->ICustomTabsServiceClass:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-class v4, Landroid/content/ComponentName;

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 206
    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    const-string v3, "android.support.customtabs.ICustomTabsService$Stub"

    .line 207
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "asInterface"

    .line 208
    new-array v7, v6, [Ljava/lang/Class;

    const-class v8, Landroid/os/IBinder;

    aput-object v8, v7, v5

    invoke-virtual {v3, v4, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 210
    new-array v2, v2, [Ljava/lang/Object;

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p2, v4, v5

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    aput-object p2, v2, v5

    aput-object p1, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 211
    invoke-virtual {p0, p1, p2}, Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;->onCustomTabsServiceConnected(Landroid/content/ComponentName;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 213
    :catch_0
    invoke-virtual {p0, v0, v0}, Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;->onCustomTabsServiceConnected(Landroid/content/ComponentName;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
