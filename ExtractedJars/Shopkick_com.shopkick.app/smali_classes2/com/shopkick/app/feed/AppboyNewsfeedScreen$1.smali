.class Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "AppboyNewsfeedScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->setupTab()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    .line 79
    :pswitch_0
    new-instance p1, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;

    invoke-direct {p1}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;-><init>()V

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-static {v0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->access$100(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)Lcom/shopkick/app/application/ScreenGlobals;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;)V

    return-object p1

    .line 75
    :pswitch_1
    new-instance p1, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;

    invoke-direct {p1}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;-><init>()V

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-static {v0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->access$000(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)Lcom/shopkick/app/application/ScreenGlobals;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    .line 93
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    const v0, 0x7f11003b

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 91
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$1;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    const v0, 0x7f110039

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
