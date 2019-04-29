.class Lretrofit/RestAdapter$Builder$1;
.super Ljava/lang/Object;
.source "RestAdapter.java"

# interfaces
.implements Lretrofit/client/Client$Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lretrofit/RestAdapter$Builder;

.field final synthetic val$client:Lretrofit/client/Client;


# direct methods
.method constructor <init>(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)V
    .locals 0

    .line 583
    iput-object p1, p0, Lretrofit/RestAdapter$Builder$1;->this$0:Lretrofit/RestAdapter$Builder;

    iput-object p2, p0, Lretrofit/RestAdapter$Builder$1;->val$client:Lretrofit/client/Client;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lretrofit/client/Client;
    .locals 1

    .line 585
    iget-object v0, p0, Lretrofit/RestAdapter$Builder$1;->val$client:Lretrofit/client/Client;

    return-object v0
.end method
