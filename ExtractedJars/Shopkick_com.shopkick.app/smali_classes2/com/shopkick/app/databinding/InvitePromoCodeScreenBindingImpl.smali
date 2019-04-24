.class public Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;
.super Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;
.source "InvitePromoCodeScreenBindingImpl.java"

# interfaces
.implements Lcom/shopkick/app/generated/callback/OnClickListener$Listener;


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
.field private final mCallback1:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback2:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback3:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback4:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback5:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback6:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback7:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback8:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback9:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mDirtyFlags:J

.field private final mboundView0:Landroid/widget/ScrollView;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView1:Landroid/support/constraint/ConstraintLayout;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView19:Landroid/support/constraint/Group;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView23:Lcom/facebook/shimmer/ShimmerFrameLayout;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView24:Lcom/facebook/shimmer/ShimmerFrameLayout;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 17
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f09033a

    const/16 v2, 0x21

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f0902d6

    const/16 v2, 0x22

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 19
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f0902d7

    const/16 v2, 0x23

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f09055a

    const/16 v2, 0x24

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 21
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090559

    const/16 v2, 0x25

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 22
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090340

    const/16 v2, 0x26

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 23
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090345

    const/16 v2, 0x27

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 24
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090349

    const/16 v2, 0x28

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 25
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090348

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 26
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f09034e

    const/16 v2, 0x2a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 27
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f09034d

    const/16 v2, 0x2b

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 28
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090685

    const/16 v2, 0x2c

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 29
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090684

    const/16 v2, 0x2d

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 30
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f090682

    const/16 v2, 0x2e

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

    .line 67
    sget-object v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sIncludes:Landroid/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x2f

    invoke-static {p1, p2, v2, v0, v1}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mapBindings(Landroid/databinding/DataBindingComponent;Landroid/view/View;ILandroid/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;-><init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 47

    move-object/from16 v3, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v4, 0x1a

    .line 70
    aget-object v4, p3, v4

    check-cast v4, Lcom/shopkick/app/widget/SKButton;

    const/16 v5, 0x19

    aget-object v5, p3, v5

    check-cast v5, Landroid/support/constraint/ConstraintLayout;

    const/16 v6, 0x15

    aget-object v6, p3, v6

    check-cast v6, Landroid/support/constraint/Group;

    const/16 v7, 0x22

    aget-object v7, p3, v7

    check-cast v7, Landroid/view/View;

    const/16 v8, 0x23

    aget-object v8, p3, v8

    check-cast v8, Landroid/widget/Space;

    const/4 v15, 0x2

    aget-object v9, p3, v15

    check-cast v9, Landroid/widget/ImageView;

    const/16 v10, 0x21

    aget-object v10, p3, v10

    check-cast v10, Landroid/support/constraint/ConstraintLayout;

    const/16 v11, 0x26

    aget-object v11, p3, v11

    check-cast v11, Lcom/shopkick/app/widget/SKTextView;

    const/16 v12, 0xf

    aget-object v12, p3, v12

    check-cast v12, Lcom/shopkick/app/widget/SKButton;

    const/16 v13, 0x27

    aget-object v13, p3, v13

    check-cast v13, Landroid/widget/ImageView;

    const/16 v14, 0x14

    aget-object v14, p3, v14

    check-cast v14, Lcom/shopkick/app/widget/SKTextView;

    const/16 v16, 0x10

    aget-object v16, p3, v16

    check-cast v16, Landroid/support/constraint/ConstraintLayout;

    move-object/from16 v15, v16

    const/16 v16, 0x29

    aget-object v16, p3, v16

    check-cast v16, Lcom/shopkick/app/widget/SKTextView;

    const/16 v17, 0x28

    aget-object v17, p3, v17

    check-cast v17, Lcom/shopkick/app/widget/SKTextView;

    const/16 v18, 0xe

    aget-object v18, p3, v18

    check-cast v18, Landroid/support/constraint/ConstraintLayout;

    const/16 v19, 0x12

    aget-object v19, p3, v19

    check-cast v19, Landroid/support/v7/widget/RecyclerView;

    const/16 v20, 0x2b

    aget-object v20, p3, v20

    check-cast v20, Landroid/view/View;

    const/16 v21, 0x2a

    aget-object v21, p3, v21

    check-cast v21, Lcom/shopkick/app/widget/SKTextView;

    const/16 v22, 0x11

    aget-object v22, p3, v22

    check-cast v22, Lcom/shopkick/app/widget/SKTextView;

    const/16 v23, 0x1b

    aget-object v23, p3, v23

    check-cast v23, Landroid/support/constraint/ConstraintLayout;

    const/16 v24, 0x1e

    aget-object v24, p3, v24

    check-cast v24, Lcom/shopkick/app/widget/SKTextView;

    const/16 v25, 0x1d

    aget-object v25, p3, v25

    check-cast v25, Lcom/shopkick/app/widget/SKTextView;

    const/16 v26, 0x1f

    aget-object v26, p3, v26

    check-cast v26, Lcom/shopkick/app/widget/SKButton;

    const/16 v27, 0x20

    aget-object v27, p3, v27

    check-cast v27, Landroid/widget/ProgressBar;

    const/16 v28, 0x1c

    aget-object v28, p3, v28

    check-cast v28, Landroid/widget/ImageView;

    const/4 v3, 0x5

    aget-object v29, p3, v3

    check-cast v29, Landroid/support/constraint/ConstraintLayout;

    const/16 v3, 0x8

    aget-object v30, p3, v3

    check-cast v30, Lcom/shopkick/app/widget/SKButton;

    const/16 v3, 0x9

    aget-object v31, p3, v3

    check-cast v31, Landroid/support/constraint/ConstraintLayout;

    const/16 v32, 0x25

    aget-object v32, p3, v32

    check-cast v32, Lcom/shopkick/app/widget/SKTextView;

    const/16 v33, 0x24

    aget-object v33, p3, v33

    check-cast v33, Lcom/shopkick/app/widget/SKTextView;

    const/4 v3, 0x6

    aget-object v34, p3, v3

    check-cast v34, Lcom/shopkick/app/widget/SKButton;

    const/4 v3, 0x7

    aget-object v35, p3, v3

    check-cast v35, Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v36, 0xb

    aget-object v36, p3, v36

    check-cast v36, Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v37, 0xc

    aget-object v37, p3, v37

    check-cast v37, Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v38, 0xd

    aget-object v38, p3, v38

    check-cast v38, Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v39, 0xa

    aget-object v39, p3, v39

    check-cast v39, Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v40, 0x2e

    aget-object v40, p3, v40

    check-cast v40, Landroid/view/View;

    const/16 v41, 0x16

    aget-object v41, p3, v41

    check-cast v41, Landroid/widget/LinearLayout;

    const/16 v42, 0x2d

    aget-object v42, p3, v42

    check-cast v42, Landroid/view/View;

    const/16 v43, 0x2c

    aget-object v43, p3, v43

    check-cast v43, Landroid/view/View;

    const/4 v3, 0x4

    aget-object v44, p3, v3

    check-cast v44, Lcom/shopkick/app/widget/SKTextView;

    const/4 v3, 0x3

    aget-object v45, p3, v3

    check-cast v45, Lcom/shopkick/app/widget/SKTextView;

    const/16 v46, 0xc

    move/from16 v3, v46

    invoke-direct/range {v0 .. v45}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;-><init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;ILcom/shopkick/app/widget/SKButton;Landroid/support/constraint/ConstraintLayout;Landroid/support/constraint/Group;Landroid/view/View;Landroid/widget/Space;Landroid/widget/ImageView;Landroid/support/constraint/ConstraintLayout;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKButton;Landroid/widget/ImageView;Lcom/shopkick/app/widget/SKTextView;Landroid/support/constraint/ConstraintLayout;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKTextView;Landroid/support/constraint/ConstraintLayout;Landroid/support/v7/widget/RecyclerView;Landroid/view/View;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKTextView;Landroid/support/constraint/ConstraintLayout;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKButton;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/support/constraint/ConstraintLayout;Lcom/shopkick/app/widget/SKButton;Landroid/support/constraint/ConstraintLayout;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/logging/UserEventImageView;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/widget/SKTextView;)V

    const-wide/16 v0, -0x1

    move-object/from16 v2, p0

    .line 1039
    iput-wide v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 114
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->bottomFixedCtaButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setTag(Ljava/lang/Object;)V

    .line 115
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->bottomFixedCtaButtonGroup:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    .line 116
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->group:Landroid/support/constraint/Group;

    invoke-virtual {v0, v1}, Landroid/support/constraint/Group;->setTag(Ljava/lang/Object;)V

    .line 117
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->inviteHeaderArt:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 118
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendSeeAllButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setTag(Ljava/lang/Object;)V

    .line 119
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsEmptyDisclaimerText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTag(Ljava/lang/Object;)V

    .line 120
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsEmptySection:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    .line 121
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsSection:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    .line 122
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsSectionRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setTag(Ljava/lang/Object;)V

    .line 123
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsTotalKicksEarnedTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTag(Ljava/lang/Object;)V

    .line 124
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invtePromoCodeOfflineSection:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 125
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView0:Landroid/widget/ScrollView;

    .line 126
    iget-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView0:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 127
    aget-object v3, p3, v0

    check-cast v3, Landroid/support/constraint/ConstraintLayout;

    iput-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView1:Landroid/support/constraint/ConstraintLayout;

    .line 128
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView1:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v3, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0x13

    .line 129
    aget-object v3, p3, v3

    check-cast v3, Landroid/support/constraint/Group;

    iput-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView19:Landroid/support/constraint/Group;

    .line 130
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView19:Landroid/support/constraint/Group;

    invoke-virtual {v3, v1}, Landroid/support/constraint/Group;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0x17

    .line 131
    aget-object v3, p3, v3

    check-cast v3, Lcom/facebook/shimmer/ShimmerFrameLayout;

    iput-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView23:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 132
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView23:Lcom/facebook/shimmer/ShimmerFrameLayout;

    invoke-virtual {v3, v1}, Lcom/facebook/shimmer/ShimmerFrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0x18

    .line 133
    aget-object v3, p3, v3

    check-cast v3, Lcom/facebook/shimmer/ShimmerFrameLayout;

    iput-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView24:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 134
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView24:Lcom/facebook/shimmer/ShimmerFrameLayout;

    invoke-virtual {v3, v1}, Lcom/facebook/shimmer/ShimmerFrameLayout;->setTag(Ljava/lang/Object;)V

    .line 135
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionDetailText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTag(Ljava/lang/Object;)V

    .line 136
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionHeaderText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTag(Ljava/lang/Object;)V

    .line 137
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionRetryButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setTag(Ljava/lang/Object;)V

    .line 138
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionRetryButtonSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    .line 139
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineStatusImage:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 140
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSection:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v3, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    .line 141
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionCtaButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setTag(Ljava/lang/Object;)V

    .line 142
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionCtaButtonSpecificChannelGroup:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v3, v1}, Landroid/support/constraint/ConstraintLayout;->setTag(Ljava/lang/Object;)V

    .line 143
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionPromoCodeTextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setTag(Ljava/lang/Object;)V

    .line 144
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionShareIcon:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setTag(Ljava/lang/Object;)V

    .line 145
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareEmailButton:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setTag(Ljava/lang/Object;)V

    .line 146
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareFbButton:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setTag(Ljava/lang/Object;)V

    .line 147
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareNativeButton:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setTag(Ljava/lang/Object;)V

    .line 148
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareSmsButton:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setTag(Ljava/lang/Object;)V

    .line 149
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shimmerLoadingSection:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 150
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->subtitleText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTag(Ljava/lang/Object;)V

    .line 151
    iget-object v3, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->titleText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 152
    invoke-virtual {v2, v1}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 154
    new-instance v1, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v1, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback9:Landroid/view/View$OnClickListener;

    .line 155
    new-instance v1, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v1, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback8:Landroid/view/View$OnClickListener;

    .line 156
    new-instance v1, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v1, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback7:Landroid/view/View$OnClickListener;

    .line 157
    new-instance v1, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v1, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback2:Landroid/view/View$OnClickListener;

    .line 158
    new-instance v1, Lcom/shopkick/app/generated/callback/OnClickListener;

    invoke-direct {v1, v2, v0}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v1, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback1:Landroid/view/View$OnClickListener;

    .line 159
    new-instance v0, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/4 v1, 0x6

    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback6:Landroid/view/View$OnClickListener;

    .line 160
    new-instance v0, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/4 v1, 0x5

    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback5:Landroid/view/View$OnClickListener;

    .line 161
    new-instance v0, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/4 v1, 0x4

    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback4:Landroid/view/View$OnClickListener;

    .line 162
    new-instance v0, Lcom/shopkick/app/generated/callback/OnClickListener;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/generated/callback/OnClickListener;-><init>(Lcom/shopkick/app/generated/callback/OnClickListener$Listener;I)V

    iput-object v0, v2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback3:Landroid/view/View$OnClickListener;

    .line 163
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewmodelDataReady(Landroid/databinding/ObservableBoolean;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 338
    monitor-enter p0

    .line 339
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 340
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

.method private onChangeViewmodelDeviceOffline(Landroid/databinding/ObservableBoolean;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 311
    monitor-enter p0

    .line 312
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 313
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

.method private onChangeViewmodelInvitePromoCodeInfoDisplayData(Landroid/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/databinding/ObservableField<",
            "Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 320
    monitor-enter p0

    .line 321
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 322
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

.method private onChangeViewmodelInvitedFriendDisclaimerText(Landroid/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 347
    monitor-enter p0

    .line 348
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 349
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

.method private onChangeViewmodelInvitedFriendsList(Landroid/databinding/ObservableList;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/databinding/ObservableList<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 248
    monitor-enter p0

    .line 249
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 250
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

.method private onChangeViewmodelOfflineSectionDetailTextID(Landroid/databinding/ObservableInt;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 284
    monitor-enter p0

    .line 285
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 286
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

.method private onChangeViewmodelOfflineSectionHeaderTextID(Landroid/databinding/ObservableInt;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 257
    monitor-enter p0

    .line 258
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 259
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

.method private onChangeViewmodelOfflineSectionImageID(Landroid/databinding/ObservableInt;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 293
    monitor-enter p0

    .line 294
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 295
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

.method private onChangeViewmodelServerOffline(Landroid/databinding/ObservableBoolean;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 266
    monitor-enter p0

    .line 267
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 268
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

.method private onChangeViewmodelShareButtonExpGroup(Landroid/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/databinding/ObservableField<",
            "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 329
    monitor-enter p0

    .line 330
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x200

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 331
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

.method private onChangeViewmodelShouldShowInvitedFriends(Landroid/databinding/ObservableBoolean;I)Z
    .locals 2

    if-nez p2, :cond_0

    .line 275
    monitor-enter p0

    .line 276
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 277
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

.method private onChangeViewmodelTotalKicksEarnedString(Landroid/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 302
    monitor-enter p0

    .line 303
    :try_start_0
    iget-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 304
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
.method public final _internalCallbackOnClick(ILandroid/view/View;)V
    .locals 1

    const/4 p2, 0x1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_9

    .line 872
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    if-eqz p2, :cond_9

    .line 880
    invoke-virtual {p1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->loadData()V

    goto/16 :goto_9

    .line 889
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move p2, v0

    :goto_1
    if-eqz p2, :cond_9

    .line 899
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto/16 :goto_9

    .line 908
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move p2, v0

    :goto_2
    if-eqz p2, :cond_9

    .line 918
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto/16 :goto_9

    .line 965
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move p2, v0

    :goto_3
    if-eqz p2, :cond_9

    .line 975
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->FACEBOOK:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto :goto_9

    .line 984
    :pswitch_4
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    move p2, v0

    :goto_4
    if-eqz p2, :cond_9

    .line 994
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->EMAIL:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto :goto_9

    .line 1003
    :pswitch_5
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_5

    goto :goto_5

    :cond_5
    move p2, v0

    :goto_5
    if-eqz p2, :cond_9

    .line 1013
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->SMS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto :goto_9

    .line 1022
    :pswitch_6
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_6
    move p2, v0

    :goto_6
    if-eqz p2, :cond_9

    .line 1032
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto :goto_9

    .line 927
    :pswitch_7
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_7

    goto :goto_7

    :cond_7
    move p2, v0

    :goto_7
    if-eqz p2, :cond_9

    .line 937
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    goto :goto_9

    .line 946
    :pswitch_8
    iget-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    if-eqz p1, :cond_8

    goto :goto_8

    :cond_8
    move p2, v0

    :goto_8
    if-eqz p2, :cond_9

    .line 956
    sget-object p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->COPY_TO_CLIPBOARD:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    :cond_9
    :goto_9
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected executeBindings()V
    .locals 58

    move-object/from16 v1, p0

    .line 358
    monitor-enter p0

    .line 359
    :try_start_0
    iget-wide v2, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 360
    iput-wide v4, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 361
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 365
    iget-boolean v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mIsDataLoading:Z

    .line 405
    iget-object v6, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    const-wide/16 v7, 0x7400

    and-long v9, v2, v7

    cmp-long v9, v9, v4

    const-wide/16 v10, 0x5000

    const/4 v13, 0x0

    if-eqz v9, :cond_5

    and-long v14, v2, v10

    cmp-long v9, v14, v4

    if-eqz v9, :cond_1

    if-eqz v0, :cond_0

    const-wide/32 v14, 0x40000

    or-long/2addr v2, v14

    const-wide/32 v14, 0x100000

    or-long/2addr v2, v14

    goto :goto_0

    :cond_0
    const-wide/32 v14, 0x20000

    or-long/2addr v2, v14

    const-wide/32 v14, 0x80000

    or-long/2addr v2, v14

    :cond_1
    :goto_0
    and-long v14, v2, v10

    cmp-long v9, v14, v4

    if-eqz v9, :cond_4

    if-eqz v0, :cond_2

    move v9, v13

    goto :goto_1

    :cond_2
    const/16 v9, 0x8

    :goto_1
    if-eqz v0, :cond_3

    const/4 v14, 0x4

    goto :goto_2

    :cond_3
    move v14, v13

    goto :goto_2

    :cond_4
    move v9, v13

    move v14, v9

    :goto_2
    xor-int/lit8 v15, v0, 0x1

    goto :goto_3

    :cond_5
    move v9, v13

    move v14, v9

    move v15, v14

    :goto_3
    const-wide/16 v16, 0x7fff

    and-long v16, v2, v16

    cmp-long v16, v16, v4

    const-wide/16 v17, 0x6100

    const-wide/16 v19, 0x6084

    const-wide/16 v21, 0x6002

    const-wide/32 v23, 0x1000000

    const-wide/16 v25, 0x6200

    const-wide/16 v27, 0x6600

    const/4 v10, 0x3

    const-wide/16 v29, 0x6001

    if-eqz v16, :cond_48

    and-long v31, v2, v29

    cmp-long v16, v31, v4

    const/4 v11, 0x1

    if-eqz v16, :cond_10

    if-eqz v6, :cond_6

    .line 447
    iget-object v7, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendsList:Landroid/databinding/ObservableList;

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    .line 449
    :goto_4
    invoke-virtual {v1, v13, v7}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/ObservableList;)Z

    if-eqz v7, :cond_7

    .line 454
    invoke-interface {v7}, Landroid/databinding/ObservableList;->size()I

    move-result v8

    goto :goto_5

    :cond_7
    move v8, v13

    :goto_5
    if-lez v8, :cond_8

    move/from16 v34, v11

    goto :goto_6

    :cond_8
    move/from16 v34, v13

    :goto_6
    if-le v8, v10, :cond_9

    move v8, v11

    goto :goto_7

    :cond_9
    move v8, v13

    :goto_7
    if-eqz v16, :cond_b

    if-eqz v34, :cond_a

    const-wide/32 v35, 0x400000

    or-long v2, v2, v35

    const-wide/32 v35, 0x10000000

    or-long v2, v2, v35

    goto :goto_8

    :cond_a
    const-wide/32 v35, 0x200000

    or-long v2, v2, v35

    const-wide/32 v35, 0x8000000

    or-long v2, v2, v35

    :cond_b
    :goto_8
    and-long v35, v2, v29

    cmp-long v16, v35, v4

    if-eqz v16, :cond_d

    if-eqz v8, :cond_c

    or-long v2, v2, v23

    goto :goto_9

    :cond_c
    const-wide/32 v35, 0x800000

    or-long v2, v2, v35

    :cond_d
    :goto_9
    if-eqz v34, :cond_e

    move/from16 v16, v13

    goto :goto_a

    :cond_e
    const/16 v16, 0x8

    :goto_a
    if-eqz v34, :cond_f

    const/16 v34, 0x8

    goto :goto_b

    :cond_f
    move/from16 v34, v13

    goto :goto_b

    :cond_10
    move v8, v13

    move/from16 v16, v8

    move/from16 v34, v16

    const/4 v7, 0x0

    :goto_b
    and-long v35, v2, v21

    cmp-long v35, v35, v4

    if-eqz v35, :cond_12

    if-eqz v6, :cond_11

    .line 491
    iget-object v13, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionHeaderTextID:Landroid/databinding/ObservableInt;

    goto :goto_c

    :cond_11
    const/4 v13, 0x0

    .line 493
    :goto_c
    invoke-virtual {v1, v11, v13}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v13, :cond_12

    .line 498
    invoke-virtual {v13}, Landroid/databinding/ObservableInt;->get()I

    move-result v13

    goto :goto_d

    :cond_12
    const/4 v13, 0x0

    :goto_d
    and-long v36, v2, v19

    cmp-long v36, v36, v4

    if-eqz v36, :cond_19

    if-eqz v6, :cond_13

    .line 505
    iget-object v11, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->serverOffline:Landroid/databinding/ObservableBoolean;

    .line 507
    iget-object v12, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->deviceOffline:Landroid/databinding/ObservableBoolean;

    goto :goto_e

    :cond_13
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_e
    const/4 v10, 0x2

    .line 509
    invoke-virtual {v1, v10, v11}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    const/4 v10, 0x7

    .line 510
    invoke-virtual {v1, v10, v12}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v11, :cond_14

    .line 515
    invoke-virtual {v11}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v10

    goto :goto_f

    :cond_14
    const/4 v10, 0x0

    :goto_f
    if-eqz v12, :cond_15

    .line 519
    invoke-virtual {v12}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v11

    goto :goto_10

    :cond_15
    const/4 v11, 0x0

    :goto_10
    or-int/2addr v10, v11

    if-eqz v36, :cond_17

    if-eqz v10, :cond_16

    const-wide/32 v11, 0x10000

    or-long/2addr v2, v11

    goto :goto_11

    :cond_16
    const-wide/32 v11, 0x8000

    or-long/2addr v2, v11

    :cond_17
    :goto_11
    if-eqz v10, :cond_18

    const/4 v10, 0x0

    goto :goto_12

    :cond_18
    const/16 v10, 0x8

    goto :goto_12

    :cond_19
    const/4 v10, 0x0

    :goto_12
    const-wide/16 v11, 0x6008

    and-long/2addr v11, v2

    cmp-long v11, v11, v4

    if-eqz v11, :cond_1f

    if-eqz v6, :cond_1a

    .line 542
    iget-object v12, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shouldShowInvitedFriends:Landroid/databinding/ObservableBoolean;

    const/4 v4, 0x3

    goto :goto_13

    :cond_1a
    const/4 v4, 0x3

    const/4 v12, 0x0

    .line 544
    :goto_13
    invoke-virtual {v1, v4, v12}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v12, :cond_1b

    .line 549
    invoke-virtual {v12}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v4

    goto :goto_14

    :cond_1b
    const/4 v4, 0x0

    :goto_14
    if-eqz v11, :cond_1d

    if-eqz v4, :cond_1c

    const-wide/32 v11, 0x40000000

    or-long/2addr v2, v11

    goto :goto_15

    :cond_1c
    const-wide/32 v11, 0x20000000

    or-long/2addr v2, v11

    :cond_1d
    :goto_15
    if-eqz v4, :cond_1e

    const/4 v4, 0x0

    goto :goto_16

    :cond_1e
    const/16 v4, 0x8

    goto :goto_16

    :cond_1f
    const/4 v4, 0x0

    :goto_16
    const-wide/16 v11, 0x6010

    and-long/2addr v11, v2

    const-wide/16 v39, 0x0

    cmp-long v5, v11, v39

    if-eqz v5, :cond_21

    if-eqz v6, :cond_20

    .line 568
    iget-object v11, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionDetailTextID:Landroid/databinding/ObservableInt;

    goto :goto_17

    :cond_20
    const/4 v11, 0x0

    :goto_17
    const/4 v5, 0x4

    .line 570
    invoke-virtual {v1, v5, v11}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v11, :cond_21

    .line 575
    invoke-virtual {v11}, Landroid/databinding/ObservableInt;->get()I

    move-result v5

    goto :goto_18

    :cond_21
    const/4 v5, 0x0

    :goto_18
    const-wide/16 v11, 0x6020

    and-long/2addr v11, v2

    const-wide/16 v39, 0x0

    cmp-long v11, v11, v39

    if-eqz v11, :cond_23

    if-eqz v6, :cond_22

    .line 582
    iget-object v11, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionImageID:Landroid/databinding/ObservableInt;

    goto :goto_19

    :cond_22
    const/4 v11, 0x0

    :goto_19
    const/4 v12, 0x5

    .line 584
    invoke-virtual {v1, v12, v11}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v11, :cond_23

    .line 589
    invoke-virtual {v11}, Landroid/databinding/ObservableInt;->get()I

    move-result v11

    goto :goto_1a

    :cond_23
    const/4 v11, 0x0

    :goto_1a
    const-wide/16 v41, 0x6040

    and-long v41, v2, v41

    const-wide/16 v39, 0x0

    cmp-long v12, v41, v39

    if-eqz v12, :cond_25

    if-eqz v6, :cond_24

    .line 596
    iget-object v12, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->totalKicksEarnedString:Landroid/databinding/ObservableField;

    move/from16 v36, v4

    goto :goto_1b

    :cond_24
    move/from16 v36, v4

    const/4 v12, 0x0

    :goto_1b
    const/4 v4, 0x6

    .line 598
    invoke-virtual {v1, v4, v12}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v12, :cond_26

    .line 603
    invoke-virtual {v12}, Landroid/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_1c

    :cond_25
    move/from16 v36, v4

    :cond_26
    const/4 v4, 0x0

    :goto_1c
    and-long v41, v2, v17

    const-wide/16 v39, 0x0

    cmp-long v12, v41, v39

    if-eqz v12, :cond_29

    if-eqz v6, :cond_27

    .line 610
    iget-object v12, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitePromoCodeInfoDisplayData:Landroid/databinding/ObservableField;

    move-object/from16 v38, v4

    const/16 v4, 0x8

    goto :goto_1d

    :cond_27
    move-object/from16 v38, v4

    const/16 v4, 0x8

    const/4 v12, 0x0

    .line 612
    :goto_1d
    invoke-virtual {v1, v4, v12}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v12, :cond_28

    .line 617
    invoke-virtual {v12}, Landroid/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    goto :goto_1e

    :cond_28
    const/4 v12, 0x0

    :goto_1e
    if-eqz v12, :cond_2a

    .line 623
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->rewardInfoTitle:Ljava/lang/String;

    move-object/from16 v42, v4

    .line 625
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->promoCode:Ljava/lang/String;

    move-object/from16 v43, v4

    .line 627
    iget-object v4, v12, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->rewardInfoSubtitle:Ljava/lang/String;

    .line 629
    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->CTAButtonText:Ljava/lang/String;

    goto :goto_1f

    :cond_29
    move-object/from16 v38, v4

    :cond_2a
    const/4 v4, 0x0

    const/4 v12, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    :goto_1f
    and-long v44, v2, v27

    const-wide/16 v39, 0x0

    cmp-long v44, v44, v39

    if-eqz v44, :cond_37

    if-eqz v6, :cond_2b

    move-object/from16 v44, v4

    .line 636
    iget-object v4, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareButtonExpGroup:Landroid/databinding/ObservableField;

    move/from16 v45, v5

    goto :goto_20

    :cond_2b
    move-object/from16 v44, v4

    move/from16 v45, v5

    const/4 v4, 0x0

    :goto_20
    const/16 v5, 0x9

    .line 638
    invoke-virtual {v1, v5, v4}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v4, :cond_2c

    .line 643
    invoke-virtual {v4}, Landroid/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    goto :goto_21

    :cond_2c
    const/4 v4, 0x0

    :goto_21
    and-long v46, v2, v25

    const-wide/16 v39, 0x0

    cmp-long v5, v46, v39

    if-eqz v5, :cond_35

    move-object/from16 v46, v7

    .line 649
    sget-object v7, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->SHARE_ICONS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    if-ne v4, v7, :cond_2d

    move/from16 v47, v8

    const/4 v7, 0x1

    goto :goto_22

    :cond_2d
    move/from16 v47, v8

    const/4 v7, 0x0

    .line 651
    :goto_22
    sget-object v8, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    if-ne v4, v8, :cond_2e

    const/4 v8, 0x1

    goto :goto_23

    :cond_2e
    const/4 v8, 0x0

    :goto_23
    if-eqz v5, :cond_30

    if-eqz v7, :cond_2f

    const-wide v48, 0x400000000L

    or-long v2, v2, v48

    goto :goto_24

    :cond_2f
    const-wide v48, 0x200000000L

    or-long v2, v2, v48

    :cond_30
    :goto_24
    and-long v48, v2, v25

    const-wide/16 v39, 0x0

    cmp-long v5, v48, v39

    if-eqz v5, :cond_32

    if-eqz v8, :cond_31

    const-wide v48, 0x100000000L

    or-long v2, v2, v48

    goto :goto_25

    :cond_31
    const-wide v48, 0x80000000L

    or-long v2, v2, v48

    :cond_32
    :goto_25
    if-eqz v7, :cond_33

    const/4 v5, 0x0

    goto :goto_26

    :cond_33
    const/16 v5, 0x8

    :goto_26
    if-eqz v8, :cond_34

    const/4 v7, 0x0

    goto :goto_27

    :cond_34
    const/16 v7, 0x8

    goto :goto_27

    :cond_35
    move-object/from16 v46, v7

    move/from16 v47, v8

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 677
    :goto_27
    sget-object v8, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STICKY_TO_BOTTOM:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    if-ne v4, v8, :cond_36

    const/16 v37, 0x1

    goto :goto_28

    :cond_36
    const/16 v37, 0x0

    goto :goto_28

    :cond_37
    move-object/from16 v44, v4

    move/from16 v45, v5

    move-object/from16 v46, v7

    move/from16 v47, v8

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v37, 0x0

    :goto_28
    const-wide/16 v48, 0x7600

    and-long v48, v2, v48

    const-wide/16 v39, 0x0

    cmp-long v4, v48, v39

    if-eqz v4, :cond_45

    if-eqz v6, :cond_38

    .line 683
    iget-object v4, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    goto :goto_29

    :cond_38
    const/4 v4, 0x0

    :goto_29
    const/16 v8, 0xa

    .line 685
    invoke-virtual {v1, v8, v4}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v4, :cond_39

    .line 690
    invoke-virtual {v4}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v4

    const-wide/16 v32, 0x7400

    goto :goto_2a

    :cond_39
    const/4 v4, 0x0

    const-wide/16 v32, 0x7400

    :goto_2a
    and-long v48, v2, v32

    const-wide/16 v39, 0x0

    cmp-long v8, v48, v39

    if-eqz v8, :cond_40

    and-int/2addr v15, v4

    or-int/2addr v0, v4

    if-eqz v8, :cond_3b

    if-eqz v15, :cond_3a

    const-wide/32 v48, 0x4000000

    or-long v2, v2, v48

    const-wide/16 v32, 0x7400

    goto :goto_2b

    :cond_3a
    const-wide/32 v48, 0x2000000

    or-long v2, v2, v48

    const-wide/16 v32, 0x7400

    goto :goto_2b

    :cond_3b
    const-wide/16 v32, 0x7400

    :goto_2b
    and-long v48, v2, v32

    const-wide/16 v39, 0x0

    cmp-long v8, v48, v39

    if-eqz v8, :cond_3d

    if-eqz v0, :cond_3c

    const-wide v48, 0x1000000000L

    or-long v2, v2, v48

    goto :goto_2c

    :cond_3c
    const-wide v48, 0x800000000L

    or-long v2, v2, v48

    :cond_3d
    :goto_2c
    if-eqz v15, :cond_3e

    const/4 v8, 0x0

    goto :goto_2d

    :cond_3e
    const/16 v8, 0x8

    :goto_2d
    if-eqz v0, :cond_3f

    const/4 v0, 0x0

    goto :goto_2e

    :cond_3f
    const/16 v0, 0x8

    goto :goto_2e

    :cond_40
    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_2e
    and-long v48, v2, v27

    const-wide/16 v39, 0x0

    cmp-long v15, v48, v39

    if-eqz v15, :cond_44

    and-int v4, v4, v37

    if-eqz v15, :cond_42

    if-eqz v4, :cond_41

    const-wide v48, 0x4000000000L

    or-long v2, v2, v48

    goto :goto_2f

    :cond_41
    const-wide v48, 0x2000000000L

    or-long v2, v2, v48

    :cond_42
    :goto_2f
    if-eqz v4, :cond_43

    const/16 v41, 0x0

    goto :goto_30

    :cond_43
    const/16 v41, 0x8

    goto :goto_30

    :cond_44
    const/16 v41, 0x0

    goto :goto_30

    :cond_45
    const/4 v0, 0x0

    const/4 v8, 0x0

    const/16 v41, 0x0

    :goto_30
    const-wide/16 v48, 0x6800

    and-long v48, v2, v48

    const-wide/16 v39, 0x0

    cmp-long v4, v48, v39

    if-eqz v4, :cond_47

    if-eqz v6, :cond_46

    .line 744
    iget-object v4, v6, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendDisclaimerText:Landroid/databinding/ObservableField;

    goto :goto_31

    :cond_46
    const/4 v4, 0x0

    :goto_31
    const/16 v6, 0xb

    .line 746
    invoke-virtual {v1, v6, v4}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->updateRegistration(ILandroid/databinding/Observable;)Z

    if-eqz v4, :cond_47

    .line 751
    invoke-virtual {v4}, Landroid/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object v15, v4

    move/from16 v56, v5

    move/from16 v55, v7

    move/from16 v52, v10

    move/from16 v54, v13

    move/from16 v13, v34

    move/from16 v50, v36

    move-object/from16 v51, v38

    move/from16 v7, v41

    move-object/from16 v4, v42

    move-object/from16 v6, v43

    move-object/from16 v5, v44

    move/from16 v53, v45

    move v10, v0

    move-object/from16 v0, v46

    move/from16 v57, v16

    move/from16 v16, v11

    move/from16 v11, v57

    goto :goto_32

    :cond_47
    move/from16 v56, v5

    move/from16 v55, v7

    move/from16 v52, v10

    move/from16 v54, v13

    move/from16 v13, v34

    move/from16 v50, v36

    move-object/from16 v51, v38

    move/from16 v7, v41

    move-object/from16 v4, v42

    move-object/from16 v6, v43

    move-object/from16 v5, v44

    move/from16 v53, v45

    const/4 v15, 0x0

    move v10, v0

    move-object/from16 v0, v46

    move/from16 v57, v16

    move/from16 v16, v11

    move/from16 v11, v57

    goto :goto_32

    :cond_48
    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v47, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    :goto_32
    and-long v23, v2, v23

    const-wide/16 v36, 0x0

    cmp-long v23, v23, v36

    if-eqz v23, :cond_4a

    if-eqz v0, :cond_49

    move/from16 v24, v13

    move-object/from16 v23, v15

    const/4 v13, 0x3

    const/4 v15, 0x0

    .line 761
    invoke-interface {v0, v15, v13}, Landroid/databinding/ObservableList;->subList(II)Ljava/util/List;

    move-result-object v13

    goto :goto_34

    :cond_49
    move/from16 v24, v13

    move-object/from16 v23, v15

    goto :goto_33

    :cond_4a
    move/from16 v24, v13

    move-object/from16 v23, v15

    :goto_33
    const/4 v13, 0x0

    :goto_34
    and-long v29, v2, v29

    cmp-long v15, v29, v36

    if-eqz v15, :cond_4b

    if-eqz v47, :cond_4c

    move-object v0, v13

    goto :goto_35

    :cond_4b
    const/4 v0, 0x0

    :cond_4c
    :goto_35
    const-wide/16 v29, 0x4000

    and-long v29, v2, v29

    cmp-long v13, v29, v36

    if-eqz v13, :cond_4d

    .line 774
    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->bottomFixedCtaButton:Lcom/shopkick/app/widget/SKButton;

    move-object/from16 v29, v0

    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback8:Landroid/view/View$OnClickListener;

    invoke-virtual {v13, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 775
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionRetryButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback9:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 776
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionCtaButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback3:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 777
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionPromoCodeTextButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback1:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 778
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionShareIcon:Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback2:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 779
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareEmailButton:Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback5:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 780
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareFbButton:Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback6:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 781
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareNativeButton:Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback7:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 782
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shareSmsButton:Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v13, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mCallback4:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v13}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_36

    :cond_4d
    move-object/from16 v29, v0

    :goto_36
    and-long v17, v2, v17

    const-wide/16 v30, 0x0

    cmp-long v0, v17, v30

    if-eqz v0, :cond_4e

    .line 787
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->bottomFixedCtaButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v12}, Lcom/shopkick/app/widget/SKButton;->setButton_text(Ljava/lang/String;)V

    .line 788
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionCtaButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v12}, Lcom/shopkick/app/widget/SKButton;->setButton_text(Ljava/lang/String;)V

    .line 789
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionPromoCodeTextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v6}, Lcom/shopkick/app/widget/SKButton;->setButton_text(Ljava/lang/String;)V

    .line 790
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->subtitleText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 791
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->titleText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_4e
    and-long v4, v2, v27

    const-wide/16 v12, 0x0

    cmp-long v0, v4, v12

    if-eqz v0, :cond_4f

    .line 796
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->bottomFixedCtaButtonGroup:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v7}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    const-wide/16 v4, 0x7400

    goto :goto_37

    :cond_4f
    const-wide/16 v4, 0x7400

    :goto_37
    and-long/2addr v4, v2

    cmp-long v0, v4, v12

    if-eqz v0, :cond_50

    .line 801
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->group:Landroid/support/constraint/Group;

    invoke-virtual {v0, v8}, Landroid/support/constraint/Group;->setVisibility(I)V

    .line 802
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView1:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v10}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 803
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSection:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v8}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    const-wide/16 v4, 0x5000

    goto :goto_38

    :cond_50
    const-wide/16 v4, 0x5000

    :goto_38
    and-long/2addr v4, v2

    cmp-long v0, v4, v12

    if-eqz v0, :cond_51

    .line 808
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->inviteHeaderArt:Landroid/widget/ImageView;

    invoke-virtual {v0, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 809
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionRetryButtonSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v9}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 810
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->shimmerLoadingSection:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_51
    if-eqz v15, :cond_52

    .line 815
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendSeeAllButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v11}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 816
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsEmptySection:Landroid/support/constraint/ConstraintLayout;

    move/from16 v4, v24

    invoke-virtual {v0, v4}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    .line 817
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsSectionRecyclerView:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v4, v29

    invoke-static {v0, v4}, Lcom/shopkick/app/invite/InvitedFriendsRecyclerViewBindings;->setItems(Landroid/support/v7/widget/RecyclerView;Ljava/util/List;)V

    .line 818
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mboundView19:Landroid/support/constraint/Group;

    invoke-virtual {v0, v11}, Landroid/support/constraint/Group;->setVisibility(I)V

    :cond_52
    const-wide/16 v4, 0x6800

    and-long/2addr v4, v2

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_53

    .line 823
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsEmptyDisclaimerText:Lcom/shopkick/app/widget/SKTextView;

    move-object/from16 v4, v23

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_53
    const-wide/16 v4, 0x6008

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_54

    .line 828
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsEmptyDisclaimerText:Lcom/shopkick/app/widget/SKTextView;

    move/from16 v4, v50

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 829
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsSection:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v4}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :cond_54
    const-wide/16 v4, 0x6040

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_55

    .line 834
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invitedFriendsTotalKicksEarnedTextView:Lcom/shopkick/app/widget/SKTextView;

    move-object/from16 v4, v51

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_55
    and-long v4, v2, v19

    cmp-long v0, v4, v6

    if-eqz v0, :cond_56

    .line 839
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->invtePromoCodeOfflineSection:Landroid/support/constraint/ConstraintLayout;

    move/from16 v10, v52

    invoke-virtual {v0, v10}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :cond_56
    const-wide/16 v4, 0x6010

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_57

    .line 844
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionDetailText:Lcom/shopkick/app/widget/SKTextView;

    move/from16 v4, v53

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    :cond_57
    and-long v4, v2, v21

    cmp-long v0, v4, v6

    if-eqz v0, :cond_58

    .line 849
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineSectionHeaderText:Lcom/shopkick/app/widget/SKTextView;

    move/from16 v13, v54

    invoke-virtual {v0, v13}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    :cond_58
    const-wide/16 v4, 0x6020

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_59

    .line 854
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->offlineStatusImage:Landroid/widget/ImageView;

    invoke-static/range {v16 .. v16}, Landroid/databinding/adapters/Converters;->convertColorToDrawable(I)Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/databinding/adapters/ImageViewBindingAdapter;->setImageDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    :cond_59
    and-long v2, v2, v25

    cmp-long v0, v2, v6

    if-eqz v0, :cond_5a

    .line 859
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionCtaButton:Lcom/shopkick/app/widget/SKButton;

    move/from16 v7, v55

    invoke-virtual {v0, v7}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 860
    iget-object v0, v1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->promoCodeSectionCtaButtonSpecificChannelGroup:Landroid/support/constraint/ConstraintLayout;

    move/from16 v5, v56

    invoke-virtual {v0, v5}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    :cond_5a
    return-void

    :catchall_0
    move-exception v0

    .line 361
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 176
    monitor-enter p0

    .line 177
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 178
    monitor-exit p0

    return v0

    .line 180
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

    .line 168
    monitor-enter p0

    const-wide/16 v0, 0x4000

    .line 169
    :try_start_0
    iput-wide v0, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 170
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    invoke-virtual {p0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 170
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

    .line 242
    :pswitch_0
    check-cast p2, Landroid/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelInvitedFriendDisclaimerText(Landroid/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 240
    :pswitch_1
    check-cast p2, Landroid/databinding/ObservableBoolean;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelDataReady(Landroid/databinding/ObservableBoolean;I)Z

    move-result p1

    return p1

    .line 238
    :pswitch_2
    check-cast p2, Landroid/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelShareButtonExpGroup(Landroid/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 236
    :pswitch_3
    check-cast p2, Landroid/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelInvitePromoCodeInfoDisplayData(Landroid/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 234
    :pswitch_4
    check-cast p2, Landroid/databinding/ObservableBoolean;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelDeviceOffline(Landroid/databinding/ObservableBoolean;I)Z

    move-result p1

    return p1

    .line 232
    :pswitch_5
    check-cast p2, Landroid/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelTotalKicksEarnedString(Landroid/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 230
    :pswitch_6
    check-cast p2, Landroid/databinding/ObservableInt;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelOfflineSectionImageID(Landroid/databinding/ObservableInt;I)Z

    move-result p1

    return p1

    .line 228
    :pswitch_7
    check-cast p2, Landroid/databinding/ObservableInt;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelOfflineSectionDetailTextID(Landroid/databinding/ObservableInt;I)Z

    move-result p1

    return p1

    .line 226
    :pswitch_8
    check-cast p2, Landroid/databinding/ObservableBoolean;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelShouldShowInvitedFriends(Landroid/databinding/ObservableBoolean;I)Z

    move-result p1

    return p1

    .line 224
    :pswitch_9
    check-cast p2, Landroid/databinding/ObservableBoolean;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelServerOffline(Landroid/databinding/ObservableBoolean;I)Z

    move-result p1

    return p1

    .line 222
    :pswitch_a
    check-cast p2, Landroid/databinding/ObservableInt;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelOfflineSectionHeaderTextID(Landroid/databinding/ObservableInt;I)Z

    move-result p1

    return p1

    .line 220
    :pswitch_b
    check-cast p2, Landroid/databinding/ObservableList;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->onChangeViewmodelInvitedFriendsList(Landroid/databinding/ObservableList;I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setIsDataLoading(Z)V
    .locals 4

    .line 200
    iput-boolean p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mIsDataLoading:Z

    .line 201
    monitor-enter p0

    .line 202
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 203
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x2

    .line 204
    invoke-virtual {p0, p1}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->notifyPropertyChanged(I)V

    .line 205
    invoke-super {p0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 203
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

    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 188
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->setIsDataLoading(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ne v0, p1, :cond_1

    .line 191
    check-cast p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->setViewmodel(Lcom/shopkick/app/invite/InvitePromoCodeViewModel;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public setViewmodel(Lcom/shopkick/app/invite/InvitePromoCodeViewModel;)V
    .locals 4
    .param p1    # Lcom/shopkick/app/invite/InvitePromoCodeViewModel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 208
    iput-object p1, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mViewmodel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    .line 209
    monitor-enter p0

    .line 210
    :try_start_0
    iget-wide v0, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x2000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->mDirtyFlags:J

    .line 211
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x3

    .line 212
    invoke-virtual {p0, p1}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBindingImpl;->notifyPropertyChanged(I)V

    .line 213
    invoke-super {p0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 211
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
