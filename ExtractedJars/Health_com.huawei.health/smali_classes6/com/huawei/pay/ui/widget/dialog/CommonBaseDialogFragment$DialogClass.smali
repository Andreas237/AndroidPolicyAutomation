.class public final enum Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DialogClass"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

.field public static final enum AlertDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

.field public static final enum DatePickerDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;


# instance fields
.field private message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 33
    new-instance v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    const-string v1, "AlertDialog"

    const-string v2, "enum_alertdialog"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->AlertDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    new-instance v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    const-string v1, "DatePickerDialog"

    const-string v2, "enum_datepickerdialog"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->DatePickerDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    sget-object v1, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->AlertDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->DatePickerDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->$VALUES:[Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput-object p3, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->message:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public static getEnumByName(Ljava/lang/String;)Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;
    .locals 2

    .line 51
    const/4 v1, 0x0

    .line 52
    const-string v0, "enum_alertdialog"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    sget-object v1, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->AlertDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    goto :goto_0

    .line 56
    :cond_0
    const-string v0, "enum_datepickerdialog"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    sget-object v1, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->DatePickerDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    .line 60
    :cond_1
    :goto_0
    return-object v1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;
    .locals 1

    .line 31
    const-class v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    return-object v0
.end method

.method public static values()[Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;
    .locals 1

    .line 31
    sget-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->$VALUES:[Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    invoke-virtual {v0}, [Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->message:Ljava/lang/String;

    return-object v0
.end method
