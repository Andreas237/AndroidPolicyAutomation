.class public Lcom/huawei/operation/adapter/SportData$Data;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/adapter/SportData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Data"
.end annotation


# instance fields
.field private type:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configType(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/operation/adapter/SportData$Data;->type:I

    .line 35
    return-void
.end method

.method public configValue(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/operation/adapter/SportData$Data;->value:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public getType()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/operation/adapter/SportData$Data;->type:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/operation/adapter/SportData$Data;->value:Ljava/lang/String;

    return-object v0
.end method
