.class public abstract Lcom/huawei/hwid/UseCase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/UseCase$a;,
        Lcom/huawei/hwid/UseCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:Lcom/huawei/hwid/UseCase$RequestValues;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hwid/UseCase$RequestValues;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TQ;"
        }
    .end annotation
.end field

.field private b:Lcom/huawei/hwid/UseCase$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/hwid/UseCase$RequestValues;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TQ;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/huawei/hwid/UseCase;->a:Lcom/huawei/hwid/UseCase$RequestValues;

    return-object v0
.end method

.method public a(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TQ;)V"
        }
    .end annotation

    .line 36
    iput-object p1, p0, Lcom/huawei/hwid/UseCase;->a:Lcom/huawei/hwid/UseCase$RequestValues;

    .line 37
    return-void
.end method

.method public a(Lcom/huawei/hwid/UseCase$a;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwid/UseCase;->b:Lcom/huawei/hwid/UseCase$a;

    .line 49
    return-void
.end method

.method public b()Lcom/huawei/hwid/UseCase$a;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hwid/UseCase;->b:Lcom/huawei/hwid/UseCase$a;

    return-object v0
.end method

.method protected abstract b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TQ;)V"
        }
    .end annotation
.end method

.method c()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hwid/UseCase;->a:Lcom/huawei/hwid/UseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/UseCase;->b(Lcom/huawei/hwid/UseCase$RequestValues;)V

    .line 53
    return-void
.end method
