.class public final Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;,
        Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;
    }
.end annotation


# static fields
.field private static final ENUM_KEY:Ljava/lang/String; = "enmu_key"

.field private static final LISTENER_KEY:Ljava/lang/String; = "mlistener_key"


# instance fields
.field private activity:Landroid/app/Activity;

.field private mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

.field private mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 103
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 104
    return-void
.end method

.method public constructor <init>(Lcom/huawei/pay/ui/widget/dialog/CommonAlertDialogListener;)V
    .locals 1

    .line 112
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 113
    sget-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->AlertDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    .line 114
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 115
    return-void
.end method

.method public constructor <init>(Lcom/huawei/pay/ui/widget/dialog/CommonDatePickerDialogListener;)V
    .locals 1

    .line 123
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 124
    sget-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->DatePickerDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    .line 125
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 126
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Z)V
    .locals 9

    .line 153
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move v8, p6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Z)V

    .line 154
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Z)V
    .locals 11

    .line 171
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 172
    new-instance v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;-><init>(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;ZLcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;)V

    move-object v10, v0

    .line 261
    sget-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->AlertDialog:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    .line 262
    iput-object v10, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 263
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 138
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v8, p4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Z)V

    .line 139
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    return-object v0
.end method


# virtual methods
.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 319
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 320
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->activity:Landroid/app/Activity;

    .line 321
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 268
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 269
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 271
    const-string v0, "enmu_key"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 272
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 274
    invoke-static {v2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->getEnumByName(Ljava/lang/String;)Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    .line 276
    :cond_0
    const-string v0, "mlistener_key"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    .line 277
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    instance-of v0, v3, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    if-eqz v0, :cond_1

    .line 279
    move-object v0, v3

    check-cast v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    .line 282
    :cond_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 284
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    invoke-virtual {v0, p1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onCreate(Landroid/os/Bundle;)V

    .line 286
    :cond_2
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 13

    .line 336
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v7

    .line 337
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 339
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->dismissAllowingStateLoss()V

    .line 340
    return-object v7

    .line 343
    :cond_0
    sget-object v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$2;->$SwitchMap$com$huawei$pay$ui$widget$dialog$CommonBaseDialogFragment$DialogClass:[I

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    invoke-virtual {v1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 346
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    instance-of v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonAlertDialogListener;

    if-nez v0, :cond_1

    .line 348
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->dismissAllowingStateLoss()V

    .line 349
    return-object v7

    .line 351
    :cond_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v8

    .line 353
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    check-cast v0, Lcom/huawei/pay/ui/widget/dialog/CommonAlertDialogListener;

    invoke-virtual {v0, v8, p0}, Lcom/huawei/pay/ui/widget/dialog/CommonAlertDialogListener;->onDialogInit(Lo/yr;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    .line 354
    move-object v7, v8

    check-cast v7, Landroid/app/Dialog;

    .line 355
    goto :goto_0

    .line 357
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    instance-of v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonDatePickerDialogListener;

    if-nez v0, :cond_2

    .line 359
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->dismissAllowingStateLoss()V

    .line 360
    return-object v7

    .line 363
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 364
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 365
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 366
    const/4 v0, 0x5

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->get(I)I

    move-result v12

    .line 368
    new-instance v0, Landroid/app/DatePickerDialog;

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->activity:Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->getTheme()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    check-cast v3, Lcom/huawei/pay/ui/widget/dialog/CommonDatePickerDialogListener;

    move v4, v10

    move v5, v11

    move v6, v12

    invoke-direct/range {v0 .. v6}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;III)V

    move-object v7, v0

    .line 370
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    invoke-virtual {v0, v7, p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onDialogInit(Landroid/app/Dialog;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    .line 371
    .line 375
    :goto_0
    return-object v7

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 2

    .line 309
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 310
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onDestory()V

    .line 314
    :cond_0
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 326
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDetach()V

    .line 327
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->activity:Landroid/app/Activity;

    .line 328
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onDialogDismiss()V

    .line 388
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 389
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 291
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 294
    const-string v0, "enmu_key"

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mDialogClass:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;

    invoke-virtual {v1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$DialogClass;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 298
    const-string v0, "mlistener_key"

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 300
    :cond_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 302
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->mListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    invoke-virtual {v0, p1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 304
    :cond_2
    return-void
.end method
