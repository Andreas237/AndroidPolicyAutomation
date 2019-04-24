.class public final Lio/radar/sdk/state/StateManager_Factory;
.super Ljava/lang/Object;
.source "StateManager_Factory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lio/radar/sdk/state/StateManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final stateManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManagerRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManagerRepository;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lio/radar/sdk/state/StateManager_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 17
    iput-object p2, p0, Lio/radar/sdk/state/StateManager_Factory;->stateManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method public static create(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/state/StateManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManagerRepository;",
            ">;)",
            "Lio/radar/sdk/state/StateManager_Factory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lio/radar/sdk/state/StateManager_Factory;

    invoke-direct {v0, p0, p1}, Lio/radar/sdk/state/StateManager_Factory;-><init>(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/state/StateManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManagerRepository;",
            ">;)",
            "Lio/radar/sdk/state/StateManager;"
        }
    .end annotation

    .line 28
    new-instance v0, Lio/radar/sdk/state/StateManager;

    invoke-interface {p0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/radar/sdk/state/StateManagerRepository;

    invoke-direct {v0, p0, p1}, Lio/radar/sdk/state/StateManager;-><init>(Landroid/content/Context;Lio/radar/sdk/state/StateManagerRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lio/radar/sdk/state/StateManager;
    .locals 2

    .line 22
    iget-object v0, p0, Lio/radar/sdk/state/StateManager_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    iget-object v1, p0, Lio/radar/sdk/state/StateManager_Factory;->stateManagerRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    invoke-static {v0, v1}, Lio/radar/sdk/state/StateManager_Factory;->provideInstance(Lio/radar/shadow/javax/inject/Provider;Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/state/StateManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lio/radar/sdk/state/StateManager_Factory;->get()Lio/radar/sdk/state/StateManager;

    move-result-object v0

    return-object v0
.end method
