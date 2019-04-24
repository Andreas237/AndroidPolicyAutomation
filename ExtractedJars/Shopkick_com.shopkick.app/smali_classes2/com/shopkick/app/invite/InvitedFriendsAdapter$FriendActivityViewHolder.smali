.class Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "InvitedFriendsAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/invite/InvitedFriendsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FriendActivityViewHolder"
.end annotation


# instance fields
.field private final friendAvatarImageView:Landroid/widget/ImageView;

.field private final friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

.field private final friendNameTextView:Lcom/shopkick/app/widget/SKTextView;

.field private final friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

.field private final friendTimeStamp:Lcom/shopkick/app/widget/SKTextView;

.field private final itemView:Landroid/view/View;

.field final synthetic this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/InvitedFriendsAdapter;Landroid/view/View;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    .line 149
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f09033b

    .line 150
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendAvatarImageView:Landroid/widget/ImageView;

    const p1, 0x7f09033e

    .line 151
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendNameTextView:Lcom/shopkick/app/widget/SKTextView;

    const p1, 0x7f090342

    .line 152
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    const p1, 0x7f09033d

    .line 153
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    const p1, 0x7f090344

    .line 154
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendTimeStamp:Lcom/shopkick/app/widget/SKTextView;

    .line 155
    iput-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->itemView:Landroid/view/View;

    .line 156
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 140
    iget-object p0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendNameTextView:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method private updateAvatar(Ljava/lang/String;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendAvatarImageView:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {p2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f08005f

    invoke-static {p2, v0}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 221
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {p2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$200(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    const-string v0, "no available avaters to use."

    invoke-static {p2, v0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 222
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {p2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$200(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    rem-int/2addr p1, p2

    .line 223
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {p2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$200(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p2, p1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 225
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendAvatarImageView:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 231
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x14f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$300(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public setStatus(Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;)V
    .locals 7

    .line 174
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->kicksAward:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->kicksAward:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 175
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f0012

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    .line 176
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    .line 175
    invoke-virtual {v2, v3, v0, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 178
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->activityType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const v3, 0x7f060120

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    .line 197
    :pswitch_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->updateAvatar(Ljava/lang/String;Z)V

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f110362

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 199
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    goto/16 :goto_1

    .line 204
    :pswitch_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->name:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->updateAvatar(Ljava/lang/String;Z)V

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f110364

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 207
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    goto :goto_1

    .line 180
    :pswitch_2
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->name:Ljava/lang/String;

    invoke-direct {p0, v0, v4}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->updateAvatar(Ljava/lang/String;Z)V

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f110363

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 182
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->timeLeft:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v5, 0x0

    cmp-long v0, v2, v5

    if-nez v0, :cond_1

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f110361

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0600c7

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    goto :goto_1

    .line 187
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->timeLeft:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v5

    const-wide v5, 0x4194997000000000L    # 8.64E7

    div-double/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p1, v2

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0f0025

    new-array v3, v4, [Ljava/lang/Object;

    .line 191
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    .line 189
    invoke-virtual {v0, v2, p1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendStatusTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->this$0:Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-static {v1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0600c8

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendDetailTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 4

    .line 160
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    .line 162
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, " - MM/dd/yy"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 163
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 165
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->friendTimeStamp:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method
