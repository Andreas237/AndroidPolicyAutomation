.class public Lcom/huawei/health/sns/ui/group/healthbeans/FileDownloadUrlListBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private downloadUrl:Ljava/lang/String;

.field private id:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/FileDownloadUrlListBean;->downloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/FileDownloadUrlListBean;->id:I

    return v0
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/FileDownloadUrlListBean;->downloadUrl:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 27
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/FileDownloadUrlListBean;->id:I

    .line 28
    return-void
.end method
