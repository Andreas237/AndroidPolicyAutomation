.class public final Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;
.super Ldagger/internal/ProvidesBinding;
.source "RTModule$$ModuleAdapter.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/RTModule$$ModuleAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProvideApplicationProvidesAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ProvidesBinding<",
        "Landroid/app/Application;",
        ">;",
        "Ljavax/inject/Provider<",
        "Landroid/app/Application;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/rt/mobile/english/RTModule;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/RTModule;)V
    .locals 4

    const-string v0, "android.app.Application"

    const-string v1, "com.rt.mobile.english.RTModule"

    const-string v2, "provideApplication"

    const/4 v3, 0x1

    .line 43
    invoke-direct {p0, v0, v3, v1, v2}, Ldagger/internal/ProvidesBinding;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;->module:Lcom/rt/mobile/english/RTModule;

    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;->setLibrary(Z)V

    return-void
.end method


# virtual methods
.method public get()Landroid/app/Application;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;->module:Lcom/rt/mobile/english/RTModule;

    invoke-virtual {v0}, Lcom/rt/mobile/english/RTModule;->provideApplication()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;->get()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method
