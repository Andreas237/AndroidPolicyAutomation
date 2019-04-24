.class public Lcom/huawei/datatype/BluetoothData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private data:Ljava/lang/Object;

.field private id:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/datatype/BluetoothData;->id:Ljava/lang/String;

    .line 11
    iput-object p1, p0, Lcom/huawei/datatype/BluetoothData;->id:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/huawei/datatype/BluetoothData;->data:Ljava/lang/Object;

    .line 13
    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/datatype/BluetoothData;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/datatype/BluetoothData;->id:Ljava/lang/String;

    return-object v0
.end method
