.class public Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mResultHandleTask:Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;->mContext:Landroid/content/Context;

    .line 21
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;->mResultHandleTask:Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;

    .line 22
    return-void
.end method

.method private checkEseInitStatus()I
    .locals 2

    .line 35
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;->excuteEseInit()I

    move-result v0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 27
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;->checkEseInitStatus()I

    move-result v1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;->mResultHandleTask:Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->notifyInitEseResult(I)V

    .line 29
    return-void
.end method
