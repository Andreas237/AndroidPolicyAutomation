.class public Lcom/huawei/hwid/usecase/ClearDataUseCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/huawei/hwid/usecase/ClearDataUseCase;->a:Landroid/content/Context;

    .line 22
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/huawei/hwid/usecase/ClearDataUseCase;->a:Landroid/content/Context;

    const-string v1, "accounts.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 27
    iget-object v0, p0, Lcom/huawei/hwid/usecase/ClearDataUseCase;->a:Landroid/content/Context;

    const-string v1, "settings.properties"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 28
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 14
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/ClearDataUseCase;->a(Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;)V

    return-void
.end method
