.class Lretrofit/Platform$Base$1;
.super Ljava/lang/Object;
.source "Platform.java"

# interfaces
.implements Lretrofit/client/Client$Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/Platform$Base;->defaultClient()Lretrofit/client/Client$Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lretrofit/Platform$Base;

.field final synthetic val$client:Lretrofit/client/Client;


# direct methods
.method constructor <init>(Lretrofit/Platform$Base;Lretrofit/client/Client;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lretrofit/Platform$Base$1;->this$0:Lretrofit/Platform$Base;

    iput-object p2, p0, Lretrofit/Platform$Base$1;->val$client:Lretrofit/client/Client;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lretrofit/client/Client;
    .locals 1

    .line 83
    iget-object v0, p0, Lretrofit/Platform$Base$1;->val$client:Lretrofit/client/Client;

    return-object v0
.end method
