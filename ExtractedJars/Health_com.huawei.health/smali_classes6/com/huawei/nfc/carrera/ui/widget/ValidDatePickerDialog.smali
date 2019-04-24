.class public Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/DatePicker$OnDateChangedListener;


# static fields
.field private static final DATE_PICKER_FIELD:Ljava/lang/String; = "mDatePicker"

.field private static final DAY_PICKER_FIELD:Ljava/lang/String; = "mDayPicker"

.field private static final DAY_SPINNER_FIELD:Ljava/lang/String; = "mDaySpinner"

.field private static final DELEGATE_FIELD:Ljava/lang/String; = "mDelegate"

.field private static final TAG:Ljava/lang/String; = "ValidDatePickerDialog"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mDatePicker:Landroid/widget/DatePicker;

.field private mDatePickerDialog:Landroid/app/DatePickerDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;)V
    .locals 10

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mContext:Landroid/content/Context;

    .line 43
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 44
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 45
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 46
    const/4 v9, 0x1

    .line 48
    new-instance v0, Landroid/app/DatePickerDialog;

    move-object v1, p1

    move-object v2, p2

    move v3, v7

    move v4, v8

    move v5, v9

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    .line 49
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePicker:Landroid/widget/DatePicker;

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePicker:Landroid/widget/DatePicker;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePicker:Landroid/widget/DatePicker;

    invoke-virtual {v0, v7, v8, v9, p0}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePicker:Landroid/widget/DatePicker;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 54
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->hideDay()V

    .line 56
    :cond_0
    invoke-direct {p0, v7, v8}, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->updateTitle(II)V

    .line 57
    return-void
.end method

.method private getDatePicker()Landroid/widget/DatePicker;
    .locals 4

    .line 108
    const/4 v2, 0x0

    .line 111
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    const-string v1, "mDatePicker"

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/DatePicker;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 116
    goto :goto_0

    .line 113
    :catch_0
    move-exception v3

    .line 115
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "getDatePicker ClassCastException"

    invoke-static {v0, v1, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    :goto_0
    return-object v2
.end method

.method private getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 187
    const/4 v2, 0x0

    .line 188
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 190
    :cond_0
    return-object v2

    .line 194
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 195
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 196
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    move-object v2, v0

    .line 209
    goto :goto_0

    .line 198
    :catch_0
    move-exception v3

    .line 200
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "getFieldValue NoSuchFieldException"

    invoke-static {v0, v1, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    goto :goto_0

    .line 202
    :catch_1
    move-exception v3

    .line 204
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "getFieldValue IllegalAccessException"

    invoke-static {v0, v1, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    goto :goto_0

    .line 206
    :catch_2
    move-exception v3

    .line 208
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "getFieldValue IllegalArgumentException"

    invoke-static {v0, v1, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    :goto_0
    return-object v2
.end method

.method private hideDay()V
    .locals 10

    .line 131
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mDatePicker"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 132
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 133
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    .line 134
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 136
    const-string v0, "mDayPicker"

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mDaySpinner"

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePicker:Landroid/widget/DatePicker;

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 140
    if-eqz v8, :cond_4

    .line 142
    move-object v0, v8

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 146
    :cond_1
    const-string v0, "mDelegate"

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 148
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePicker:Landroid/widget/DatePicker;

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 150
    const/4 v9, 0x0

    .line 151
    if-eqz v8, :cond_2

    .line 153
    const-string v0, "mDaySpinner"

    invoke-direct {p0, v8, v0}, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 155
    :cond_2
    if-eqz v9, :cond_4

    .line 157
    move-object v0, v9

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    .line 134
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 174
    :cond_4
    :goto_1
    goto :goto_2

    .line 163
    :catch_0
    move-exception v2

    .line 165
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "hideDay NoSuchFieldException"

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    goto :goto_2

    .line 167
    :catch_1
    move-exception v2

    .line 169
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "hideDay IllegalAccessException"

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    goto :goto_2

    .line 171
    :catch_2
    move-exception v2

    .line 173
    const-string v0, "ValidDatePickerDialog"

    const-string v1, "hideDay IllegalArgumentException"

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 175
    :goto_2
    return-void
.end method

.method private updateTitle(II)V
    .locals 6

    .line 75
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 76
    const/4 v0, 0x1

    invoke-virtual {v4, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 77
    const/4 v0, 0x2

    invoke-virtual {v4, v0, p2}, Ljava/util/Calendar;->set(II)V

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const v3, 0x10024

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v5

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {v0, v5}, Landroid/app/DatePickerDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 81
    return-void
.end method


# virtual methods
.method public onDateChanged(Landroid/widget/DatePicker;III)V
    .locals 0

    .line 70
    invoke-direct {p0, p2, p3}, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->updateTitle(II)V

    .line 71
    return-void
.end method

.method public show()V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/ValidDatePickerDialog;->mDatePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    .line 65
    :cond_0
    return-void
.end method
