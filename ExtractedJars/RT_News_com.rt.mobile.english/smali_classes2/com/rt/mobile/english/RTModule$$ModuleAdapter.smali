.class public final Lcom/rt/mobile/english/RTModule$$ModuleAdapter;
.super Ldagger/internal/ModuleAdapter;
.source "RTModule$$ModuleAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ModuleAdapter<",
        "Lcom/rt/mobile/english/RTModule;",
        ">;"
    }
.end annotation


# static fields
.field private static final INCLUDES:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final INJECTS:[Ljava/lang/String;

.field private static final STATIC_INJECTIONS:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    .line 14
    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "members/com.rt.mobile.english.RTApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sput-object v1, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->INJECTS:[Ljava/lang/String;

    .line 15
    new-array v1, v3, [Ljava/lang/Class;

    sput-object v1, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->STATIC_INJECTIONS:[Ljava/lang/Class;

    .line 16
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Lcom/rt/mobile/english/data/DataModule;

    aput-object v1, v0, v3

    sput-object v0, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->INCLUDES:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 19
    const-class v1, Lcom/rt/mobile/english/RTModule;

    sget-object v2, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->INJECTS:[Ljava/lang/String;

    sget-object v3, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->STATIC_INJECTIONS:[Ljava/lang/Class;

    sget-object v5, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->INCLUDES:[Ljava/lang/Class;

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Ldagger/internal/ModuleAdapter;-><init>(Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;Z[Ljava/lang/Class;ZZ)V

    return-void
.end method


# virtual methods
.method public getBindings(Ldagger/internal/BindingsGroup;Lcom/rt/mobile/english/RTModule;)V
    .locals 2

    const-string v0, "android.app.Application"

    .line 28
    new-instance v1, Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/RTModule$$ModuleAdapter$ProvideApplicationProvidesAdapter;-><init>(Lcom/rt/mobile/english/RTModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    return-void
.end method

.method public bridge synthetic getBindings(Ldagger/internal/BindingsGroup;Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p2, Lcom/rt/mobile/english/RTModule;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/RTModule$$ModuleAdapter;->getBindings(Ldagger/internal/BindingsGroup;Lcom/rt/mobile/english/RTModule;)V

    return-void
.end method
