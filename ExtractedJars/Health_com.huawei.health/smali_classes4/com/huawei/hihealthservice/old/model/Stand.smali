.class public Lcom/huawei/hihealthservice/old/model/Stand;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x230f578c59b19f6eL


# instance fields
.field private standCount:[Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method


# virtual methods
.method public getStandCount()[Ljava/lang/Integer;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/Stand;->standCount:[Ljava/lang/Integer;

    invoke-virtual {v0}, [Ljava/lang/Integer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    return-object v0
.end method

.method public setStandCount([Ljava/lang/Integer;)V
    .locals 1

    .line 48
    invoke-virtual {p1}, [Ljava/lang/Integer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/Stand;->standCount:[Ljava/lang/Integer;

    .line 49
    return-void
.end method
