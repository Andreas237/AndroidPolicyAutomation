.class public Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;
.super Landroid/app/DatePickerDialog;
.source "SourceFile"

# interfaces
.implements Landroid/widget/DatePicker$OnDateChangedListener;


# instance fields
.field private mContext:Landroid/content/Context;

.field private mDateP:Landroid/widget/DatePicker;

.field private mDatePicker:Landroid/app/DatePickerDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V
    .locals 6

    .line 26
    invoke-direct/range {p0 .. p5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 27
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mContext:Landroid/content/Context;

    .line 28
    new-instance v0, Landroid/app/DatePickerDialog;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    .line 32
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    invoke-direct {p0, v0}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->getDatePickerReact(Landroid/app/DatePickerDialog;)Landroid/widget/DatePicker;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    .line 33
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    invoke-virtual {v0, p3, p4, p5, p0}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    .line 42
    :cond_0
    invoke-direct {p0, p3, p4}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->updateTitle(II)V

    .line 43
    return-void
.end method

.method private getDatePickerReact(Landroid/app/DatePickerDialog;)Landroid/widget/DatePicker;
    .locals 12

    .line 172
    const/4 v6, 0x0

    .line 175
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    .line 176
    move-object v8, v7

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    .line 178
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mDatePicker"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 181
    invoke-virtual {v11, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/DatePicker;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v6, v0

    .line 176
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 211
    :cond_1
    goto :goto_1

    .line 185
    :catch_0
    move-exception v7

    .line 189
    const-string v0, "Exception.: "

    move-object v1, v7

    const-string v2, "CustomDatePickerDialog.getDatePickerReact"

    .line 191
    invoke-virtual {v7}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 189
    const v2, 0x3611861d

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 211
    goto :goto_1

    .line 194
    :catch_1
    move-exception v7

    .line 198
    const-string v0, "Exception."

    move-object v1, v7

    const-string v2, "CustomDatePickerDialog.getDatePickerReact"

    .line 200
    invoke-virtual {v7}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 198
    const v2, 0x3611861c

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 211
    goto :goto_1

    .line 203
    :catch_2
    move-exception v7

    .line 207
    const-string v0, "Exception."

    move-object v1, v7

    const-string v2, "CustomDatePickerDialog.getDatePickerReact"

    .line 209
    invoke-virtual {v7}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 207
    const v2, 0x36118629

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 212
    :goto_1
    return-object v6
.end method

.method private hideDayView(Z)V
    .locals 19

    .line 89
    if-eqz p1, :cond_0

    .line 91
    return-void

    .line 95
    :cond_0
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    .line 96
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_7

    aget-object v10, v7, v9

    .line 98
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mDatePicker"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 100
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 101
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    invoke-virtual {v10, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/DatePicker;

    .line 102
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v12

    .line 103
    move-object v13, v12

    array-length v14, v13

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_6

    aget-object v16, v13, v15

    .line 105
    const-string v0, "mDayPicker"

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "mDaySpinner"

    .line 106
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 108
    :cond_1
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 109
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    .line 110
    if-eqz v17, :cond_2

    .line 112
    move-object/from16 v0, v17

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 114
    :cond_2
    goto :goto_2

    .line 115
    :cond_3
    const-string v0, "mDelegate"

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 118
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 119
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    .line 120
    const/16 v18, 0x0

    .line 121
    if-eqz v17, :cond_4

    .line 123
    const-string v0, "mDaySpinner"

    move-object/from16 v1, v17

    invoke-static {v1, v0}, Lcom/huawei/wallet/utils/ReflectionUtils;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v18

    .line 125
    :cond_4
    if-eqz v18, :cond_5

    .line 127
    move-object/from16 v0, v18

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 103
    :cond_5
    :goto_2
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_1

    .line 96
    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 161
    :cond_7
    goto :goto_3

    .line 135
    :catch_0
    move-exception v6

    .line 139
    const-string v0, "IllegalAccessException."

    move-object v1, v6

    const-string v2, "CustomDatePickerDialog.hideDayView"

    .line 141
    invoke-virtual {v6}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 139
    const v2, 0x3611861d

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 161
    goto :goto_3

    .line 144
    :catch_1
    move-exception v6

    .line 148
    const-string v0, "IllegalArgumentException."

    move-object v1, v6

    const-string v2, "CustomDatePickerDialog.hideDayView"

    .line 150
    invoke-virtual {v6}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 148
    const v2, 0x3611861c

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 161
    goto :goto_3

    .line 153
    :catch_2
    move-exception v6

    .line 157
    const-string v0, "Exception."

    move-object v1, v6

    const-string v2, "CustomDatePickerDialog.hideDayView"

    .line 159
    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 157
    const v2, 0x36118629

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 162
    :goto_3
    return-void
.end method

.method private updateTitle(II)V
    .locals 6

    .line 53
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 54
    const/4 v0, 0x1

    invoke-virtual {v4, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 55
    const/4 v0, 0x2

    invoke-virtual {v4, v0, p2}, Ljava/util/Calendar;->set(II)V

    .line 56
    const/4 v0, 0x5

    const/16 v1, 0xf

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 57
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const v3, 0x10024

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v5

    .line 59
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    invoke-virtual {v0, v5}, Landroid/app/DatePickerDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 60
    return-void
.end method


# virtual methods
.method public getPicker(Z)Landroid/app/DatePickerDialog;
    .locals 1

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->hideDayView(Z)V

    .line 65
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    return-object v0
.end method

.method public onDateChanged(Landroid/widget/DatePicker;III)V
    .locals 0

    .line 48
    invoke-direct {p0, p2, p3}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->updateTitle(II)V

    .line 49
    return-void
.end method

.method public setMaxDate(J)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    invoke-virtual {v0, p1, p2}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 74
    :cond_0
    return-void
.end method

.method public setMinDate(J)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDateP:Landroid/widget/DatePicker;

    invoke-virtual {v0, p1, p2}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 82
    :cond_0
    return-void
.end method

.method public show(Z)V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->hideDayView(Z)V

    .line 220
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/CustomDatePickerDialog;->mDatePicker:Landroid/app/DatePickerDialog;

    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    .line 222
    :cond_0
    return-void
.end method
