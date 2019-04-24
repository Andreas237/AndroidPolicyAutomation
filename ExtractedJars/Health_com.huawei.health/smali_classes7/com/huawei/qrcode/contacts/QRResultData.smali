.class public Lcom/huawei/qrcode/contacts/QRResultData;
.super Ljava/lang/Object;


# static fields
.field public static final TYPE_EMAIL:I = 0x3

.field public static final TYPE_TEL:I = 0x2

.field public static final TYPE_TEXT:I = 0x0

.field public static final TYPE_URL:I = 0x1


# instance fields
.field private content:Ljava/lang/String;

.field private phoneSpannableString:Ljava/lang/CharSequence;

.field private tag:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/qrcode/contacts/QRResultData;->type:I

    iput-object p1, p0, Lcom/huawei/qrcode/contacts/QRResultData;->content:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/qrcode/contacts/QRResultData;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultData;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneSpannableString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultData;->phoneSpannableString:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultData;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/huawei/qrcode/contacts/QRResultData;->type:I

    return v0
.end method

.method public setPhoneSpannableString(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/contacts/QRResultData;->phoneSpannableString:Ljava/lang/CharSequence;

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/qrcode/contacts/QRResultData;->type:I

    return-void
.end method
