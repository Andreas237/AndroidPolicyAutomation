.class public final Lio/radar/sdk/api/ApiClientRepository_Factory;
.super Ljava/lang/Object;
.source "ApiClientRepository_Factory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lio/radar/sdk/api/ApiClientRepository;",
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


# direct methods
.method public constructor <init>(Lio/radar/shadow/javax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    return-void
.end method

.method public static create(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiClientRepository_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lio/radar/sdk/api/ApiClientRepository_Factory;"
        }
    .end annotation

    .line 25
    new-instance v0, Lio/radar/sdk/api/ApiClientRepository_Factory;

    invoke-direct {v0, p0}, Lio/radar/sdk/api/ApiClientRepository_Factory;-><init>(Lio/radar/shadow/javax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiClientRepository;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lio/radar/sdk/api/ApiClientRepository;"
        }
    .end annotation

    .line 21
    new-instance v0, Lio/radar/sdk/api/ApiClientRepository;

    invoke-interface {p0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Lio/radar/sdk/api/ApiClientRepository;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public get()Lio/radar/sdk/api/ApiClientRepository;
    .locals 1

    .line 17
    iget-object v0, p0, Lio/radar/sdk/api/ApiClientRepository_Factory;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClientRepository_Factory;->provideInstance(Lio/radar/shadow/javax/inject/Provider;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lio/radar/sdk/api/ApiClientRepository_Factory;->get()Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v0

    return-object v0
.end method
