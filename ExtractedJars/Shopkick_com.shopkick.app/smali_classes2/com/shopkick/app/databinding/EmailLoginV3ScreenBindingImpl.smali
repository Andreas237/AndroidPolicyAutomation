.class public Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;
.super Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
.source "EmailLoginV3ScreenBindingImpl.java"


# static fields
.field private static final sIncludes:Landroid/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private emailandroidTextAttrChanged:Landroid/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private final mboundView0:Landroid/widget/ScrollView;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private passwordandroidTextAttrChanged:Landroid/databinding/InverseBindingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 17
    sget-object v0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090853

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    sget-object v0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f09044b

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 19
    sget-object v0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090297

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/databinding/DataBindingComponent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 104
    sget-object v0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->sIncludes:Landroid/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mapBindings(Landroid/databinding/DataBindingComponent;Landroid/view/View;ILandroid/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;-><init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 11

    const/4 v0, 0x1

    .line 107
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/shopkick/app/widget/AuthV3EditText;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/shopkick/app/widget/AuthV3ErrorBox;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/shopkick/app/widget/AuthV3EditText;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/RelativeLayout;

    const/4 v4, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;-><init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;ILcom/shopkick/app/widget/AuthV3EditText;Lcom/shopkick/app/widget/AuthV3ErrorBox;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/widget/AuthV3EditText;Landroid/widget/RelativeLayout;)V

    .line 28
    new-instance p1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$1;-><init>(Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;)V

    iput-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->emailandroidTextAttrChanged:Landroid/databinding/InverseBindingListener;

    .line 65
    new-instance p1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$2;-><init>(Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;)V

    iput-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->passwordandroidTextAttrChanged:Landroid/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 332
    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/AuthV3EditText;->setTag(Ljava/lang/Object;)V

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 117
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mboundView0:Landroid/widget/ScrollView;

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mboundView0:Landroid/widget/ScrollView;

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->setTag(Ljava/lang/Object;)V

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->password:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/AuthV3EditText;->setTag(Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p0, p2}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 122
    invoke-virtual {p0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeEmailViewModel(Lcom/shopkick/app/viewmodel/EmailLoginViewModel;I)Z
    .locals 4

    const/4 p1, 0x1

    if-nez p2, :cond_0

    .line 179
    monitor-enter p0

    .line 180
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 181
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    .line 185
    monitor-enter p0

    .line 186
    :try_start_1
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x8

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 187
    monitor-exit p0

    return p1

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private onChangeEmailViewModelEmailLoginModel(Lcom/shopkick/app/model/EmailLoginModel;I)Z
    .locals 4

    const/4 p1, 0x1

    if-nez p2, :cond_0

    .line 203
    monitor-enter p0

    .line 204
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 205
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 v0, 0x6

    if-ne p2, v0, :cond_1

    .line 209
    monitor-enter p0

    .line 210
    :try_start_1
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x10

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 211
    monitor-exit p0

    return p1

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_1
    if-ne p2, p1, :cond_2

    .line 215
    monitor-enter p0

    .line 216
    :try_start_2
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x20

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 217
    monitor-exit p0

    return p1

    :catchall_2
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private onChangeEmailViewModelGetErrorText(Landroid/databinding/ObservableInt;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 194
    monitor-enter p0

    .line 195
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 196
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method protected executeBindings()V
    .locals 22

    move-object/from16 v1, p0

    .line 226
    monitor-enter p0

    .line 227
    :try_start_0
    iget-wide v2, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 228
    iput-wide v4, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 229
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    iget-object v0, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mEmailViewModel:Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    const-wide/16 v6, 0x7f

    and-long/2addr v6, v2

    cmp-long v6, v6, v4

    const-wide/16 v7, 0x65

    const-wide/16 v9, 0x49

    const-wide/16 v11, 0x43

    const-wide/16 v13, 0x55

    const/16 v16, 0x0

    if-eqz v6, :cond_b

    and-long v17, v2, v11

    cmp-long v6, v17, v4

    if-eqz v6, :cond_1

    if-eqz v0, :cond_0

    .line 246
    invoke-virtual {v0}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->getErrorText()Landroid/databinding/ObservableInt;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object/from16 v6, v16

    :goto_0
    const/4 v15, 0x1

    .line 248
    invoke-virtual {v1, v15, v6}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 253
    invoke-virtual {v6}, Landroid/databinding/ObservableInt;->get()I

    move-result v15

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    and-long v18, v2, v9

    cmp-long v6, v18, v4

    if-eqz v6, :cond_6

    if-eqz v0, :cond_2

    .line 260
    invoke-virtual {v0}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->isShowError()Z

    move-result v18

    goto :goto_2

    :cond_2
    const/16 v18, 0x0

    :goto_2
    if-eqz v6, :cond_4

    if-eqz v18, :cond_3

    const-wide/16 v19, 0x100

    or-long v2, v2, v19

    goto :goto_3

    :cond_3
    const-wide/16 v19, 0x80

    or-long v2, v2, v19

    :cond_4
    :goto_3
    if-eqz v18, :cond_5

    const/16 v17, 0x0

    goto :goto_4

    :cond_5
    const/16 v6, 0x8

    move/from16 v17, v6

    goto :goto_4

    :cond_6
    const/16 v17, 0x0

    :goto_4
    const-wide/16 v18, 0x75

    and-long v18, v2, v18

    cmp-long v6, v18, v4

    if-eqz v6, :cond_a

    if-eqz v0, :cond_7

    .line 279
    invoke-virtual {v0}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->getEmailLoginModel()Lcom/shopkick/app/model/EmailLoginModel;

    move-result-object v0

    goto :goto_5

    :cond_7
    move-object/from16 v0, v16

    :goto_5
    const/4 v6, 0x2

    .line 281
    invoke-virtual {v1, v6, v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    and-long v18, v2, v13

    cmp-long v6, v18, v4

    if-eqz v6, :cond_8

    if-eqz v0, :cond_8

    .line 287
    invoke-virtual {v0}, Lcom/shopkick/app/model/EmailLoginModel;->getEmail()Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_8
    move-object/from16 v6, v16

    :goto_6
    and-long v18, v2, v7

    cmp-long v18, v18, v4

    if-eqz v18, :cond_9

    if-eqz v0, :cond_9

    .line 294
    invoke-virtual {v0}, Lcom/shopkick/app/model/EmailLoginModel;->getPassword()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v21, v0

    move/from16 v0, v17

    goto :goto_7

    :cond_9
    move-object/from16 v21, v16

    move/from16 v0, v17

    goto :goto_7

    :cond_a
    move-object/from16 v6, v16

    move-object/from16 v21, v6

    move/from16 v0, v17

    goto :goto_7

    :cond_b
    move-object/from16 v6, v16

    move-object/from16 v21, v6

    const/4 v0, 0x0

    const/4 v15, 0x0

    :goto_7
    and-long/2addr v13, v2

    cmp-long v13, v13, v4

    if-eqz v13, :cond_c

    .line 303
    iget-object v13, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-static {v13, v6}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->emailValidator(Lcom/shopkick/app/widget/AuthV3EditText;Ljava/lang/String;)V

    .line 304
    iget-object v13, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-static {v13, v6}, Landroid/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_c
    const-wide/16 v13, 0x40

    and-long/2addr v13, v2

    cmp-long v6, v13, v4

    if-eqz v6, :cond_d

    .line 309
    iget-object v6, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    move-object/from16 v13, v16

    check-cast v13, Landroid/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object/from16 v14, v16

    check-cast v14, Landroid/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    move-object/from16 v7, v16

    check-cast v7, Landroid/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v8, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->emailandroidTextAttrChanged:Landroid/databinding/InverseBindingListener;

    invoke-static {v6, v13, v14, v7, v8}, Landroid/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroid/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroid/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroid/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroid/databinding/InverseBindingListener;)V

    .line 310
    iget-object v6, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->password:Lcom/shopkick/app/widget/AuthV3EditText;

    iget-object v8, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->passwordandroidTextAttrChanged:Landroid/databinding/InverseBindingListener;

    invoke-static {v6, v13, v14, v7, v8}, Landroid/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroid/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroid/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroid/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroid/databinding/InverseBindingListener;)V

    :cond_d
    and-long v6, v2, v11

    cmp-long v6, v6, v4

    if-eqz v6, :cond_e

    .line 315
    iget-object v6, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    invoke-virtual {v6, v15}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setText(I)V

    :cond_e
    and-long v6, v2, v9

    cmp-long v6, v6, v4

    if-eqz v6, :cond_f

    .line 320
    iget-object v6, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    invoke-virtual {v6, v0}, Lcom/shopkick/app/widget/AuthV3ErrorBox;->setVisibility(I)V

    const-wide/16 v6, 0x65

    goto :goto_8

    :cond_f
    const-wide/16 v6, 0x65

    :goto_8
    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_10

    .line 325
    iget-object v0, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->password:Lcom/shopkick/app/widget/AuthV3EditText;

    move-object/from16 v2, v21

    invoke-static {v0, v2}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->passwordValidator(Lcom/shopkick/app/widget/AuthV3EditText;Ljava/lang/String;)V

    .line 326
    iget-object v0, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->password:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-static {v0, v2}, Landroid/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_10
    return-void

    :catchall_0
    move-exception v0

    .line 229
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 135
    monitor-enter p0

    .line 136
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 137
    monitor-exit p0

    return v0

    .line 139
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 127
    monitor-enter p0

    const-wide/16 v0, 0x40

    .line 128
    :try_start_0
    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 129
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    invoke-virtual {p0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 129
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    .line 173
    :pswitch_0
    check-cast p2, Lcom/shopkick/app/model/EmailLoginModel;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->onChangeEmailViewModelEmailLoginModel(Lcom/shopkick/app/model/EmailLoginModel;I)Z

    move-result p1

    return p1

    .line 171
    :pswitch_1
    check-cast p2, Landroid/databinding/ObservableInt;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->onChangeEmailViewModelGetErrorText(Landroid/databinding/ObservableInt;I)Z

    move-result p1

    return p1

    .line 169
    :pswitch_2
    check-cast p2, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->onChangeEmailViewModel(Lcom/shopkick/app/viewmodel/EmailLoginViewModel;I)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setEmailViewModel(Lcom/shopkick/app/viewmodel/EmailLoginViewModel;)V
    .locals 4
    .param p1    # Lcom/shopkick/app/viewmodel/EmailLoginViewModel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 156
    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    .line 157
    iput-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mEmailViewModel:Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    .line 158
    monitor-enter p0

    .line 159
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mDirtyFlags:J

    .line 160
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x5

    .line 161
    invoke-virtual {p0, p1}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->notifyPropertyChanged(I)V

    .line 162
    invoke-super {p0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 160
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x5

    if-ne v0, p1, :cond_0

    .line 147
    check-cast p2, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->setEmailViewModel(Lcom/shopkick/app/viewmodel/EmailLoginViewModel;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
