.class public Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final NULLIFY_PUSH_MSG_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final NULLIFY_PUSH_MSG_KEY_SIGN:Ljava/lang/String; = "sign"

.field static final NULLIFY_PUSH_MSG_KEY_USERID:Ljava/lang/String; = "uid"

.field static final NULLIFY_PUSH_MSG_TYPE:Ljava/lang/String; = "delaccount"


# instance fields
.field private cplc:Ljava/lang/String;

.field private sign:Ljava/lang/String;

.field private user:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method


# virtual methods
.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public getUser()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->user:Ljava/lang/String;

    return-object v0
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->cplc:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->sign:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->user:Ljava/lang/String;

    .line 63
    return-void
.end method
