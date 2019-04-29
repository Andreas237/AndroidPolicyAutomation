.class Lretrofit/Platform$OkClientInstantiator;
.super Ljava/lang/Object;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OkClientInstantiator"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static instantiate()Lretrofit/client/Client;
    .locals 1

    .line 185
    new-instance v0, Lretrofit/client/OkClient;

    invoke-direct {v0}, Lretrofit/client/OkClient;-><init>()V

    return-object v0
.end method
