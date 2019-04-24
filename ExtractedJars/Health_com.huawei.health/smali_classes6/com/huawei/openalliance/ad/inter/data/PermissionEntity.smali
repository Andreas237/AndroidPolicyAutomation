.class public Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x19557bbc4ff0023dL


# instance fields
.field private name:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->name:Ljava/lang/String;

    iput p2, p0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->type:I

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->type:I

    return v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->name:Ljava/lang/String;

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->type:I

    return-void
.end method
