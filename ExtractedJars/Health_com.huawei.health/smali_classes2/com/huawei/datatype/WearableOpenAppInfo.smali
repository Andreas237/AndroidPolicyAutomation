.class public Lcom/huawei/datatype/WearableOpenAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private className:Ljava/lang/String;

.field private packageName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getClassName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/datatype/WearableOpenAppInfo;->className:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/datatype/WearableOpenAppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public setClassName(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/datatype/WearableOpenAppInfo;->className:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/datatype/WearableOpenAppInfo;->packageName:Ljava/lang/String;

    .line 17
    return-void
.end method
