.class public final enum Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;
.super Ljava/lang/Enum;
.source "ActivityHelpOptionsDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HelpOption"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

.field public static final enum HELP_CENTER:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

.field public static final enum REPORT_ISSUE:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

.field public static final enum RESEND_GIFT_CARD:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

.field public static final enum VIEW_RECEIPT:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;


# instance fields
.field private final buttonId:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 21
    new-instance v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    const-string v1, "RESEND_GIFT_CARD"

    const/4 v2, 0x0

    const v3, 0x7f11046a

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->RESEND_GIFT_CARD:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    .line 22
    new-instance v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    const-string v1, "VIEW_RECEIPT"

    const/4 v3, 0x1

    const v4, 0x7f110468

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->VIEW_RECEIPT:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    .line 23
    new-instance v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    const-string v1, "REPORT_ISSUE"

    const/4 v4, 0x2

    const v5, 0x7f110469

    invoke-direct {v0, v1, v4, v5}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->REPORT_ISSUE:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    .line 24
    new-instance v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    const-string v1, "HELP_CENTER"

    const/4 v5, 0x3

    const v6, 0x7f110467

    invoke-direct {v0, v1, v5, v6}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->HELP_CENTER:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    const/4 v0, 0x4

    .line 20
    new-array v0, v0, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    sget-object v1, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->RESEND_GIFT_CARD:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->VIEW_RECEIPT:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->REPORT_ISSUE:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->HELP_CENTER:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->$VALUES:[Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 29
    iput p3, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->buttonId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;
    .locals 1

    .line 20
    const-class v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;
    .locals 1

    .line 20
    sget-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->$VALUES:[Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    return-object v0
.end method


# virtual methods
.method public getButtonId()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->buttonId:I

    return v0
.end method
