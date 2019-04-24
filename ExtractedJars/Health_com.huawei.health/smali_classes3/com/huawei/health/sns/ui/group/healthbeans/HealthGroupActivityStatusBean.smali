.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;
.super Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;
.source "SourceFile"


# static fields
.field public static final EXAMINE_FAIL_STATUS:I = 0x2

.field public static final EXAMINE_STATUS:I = 0x0

.field public static final RELEASE_STATUS:I = 0x1


# instance fields
.field private status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getStatus()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;->status:I

    return v0
.end method

.method public setStatus(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;->status:I

    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthGroupActivityStatusBean{status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityStatusBean;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
