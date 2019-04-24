.class public Lcom/leisen/wallet/sdk/oma/SmartCardBean;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final READER_TYPE_ESE:I = 0x1

.field public static final READER_TYPE_SD:I = 0x2

.field public static final READER_TYPE_SIM:I = 0x0


# instance fields
.field private aid:Ljava/lang/String;

.field private command:Ljava/lang/String;

.field private reader:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, -0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    .line 17
    iput p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    .line 18
    iput-object p2, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->aid:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, -0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    .line 22
    iput p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    .line 23
    iput-object p2, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->aid:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->command:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCommand()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->command:Ljava/lang/String;

    return-object v0
.end method

.method public getReader()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    return v0
.end method

.method public getReaderName()Ljava/lang/String;
    .locals 1

    .line 43
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 45
    :pswitch_0
    const-string v0, "SIM"

    return-object v0

    .line 47
    :pswitch_1
    const-string v0, "eSE"

    return-object v0

    .line 49
    :pswitch_2
    const-string v0, "SD"

    return-object v0

    .line 51
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->aid:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setCommand(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->command:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setReader(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->reader:I

    .line 35
    return-void
.end method

.method public smartCardBeanSAI1()V
    .locals 0

    .line 70
    return-void
.end method

.method public smartCardBeanSAI2()V
    .locals 0

    .line 71
    return-void
.end method

.method public smartCardBeanSAI3()V
    .locals 0

    .line 72
    return-void
.end method

.method public smartCardBeanSAI4()V
    .locals 0

    .line 73
    return-void
.end method

.method public smartCardBeanSAI5()V
    .locals 0

    .line 74
    return-void
.end method
