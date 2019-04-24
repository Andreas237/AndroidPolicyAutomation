.class public Lcom/shopkick/app/fetchers/network/QueryParameter;
.super Ljava/lang/Object;
.source "QueryParameter.java"

# interfaces
.implements Lorg/apache/http/NameValuePair;


# instance fields
.field private name:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/QueryParameter;->name:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/shopkick/app/fetchers/network/QueryParameter;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/QueryParameter;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/QueryParameter;->value:Ljava/lang/String;

    return-object v0
.end method
