.class public final Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;
.super Ldagger/internal/ModuleAdapter;
.source "DataModule$$ModuleAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;,
        Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideAppEventCounterProvidesAdapter;,
        Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;,
        Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;,
        Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideOkHttpImageClientProvidesAdapter;,
        Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideOkHttpJsonClientProvidesAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/ModuleAdapter<",
        "Lcom/rt/mobile/english/data/DataModule;",
        ">;"
    }
.end annotation


# static fields
.field private static final INCLUDES:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final INJECTS:[Ljava/lang/String;

.field private static final STATIC_INJECTIONS:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x1c

    .line 17
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "members/com.rt.mobile.english.ui.ArticleSectionFragment"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "members/com.rt.mobile.english.ui.ArticlesRecyclerViewFragment"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "members/com.rt.mobile.english.ui.ArticleActivity"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ArticleFragment"

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.BookmarkReader"

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.BookmarksRecyclerViewFragment"

    const/4 v4, 0x5

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.EpisodesActivity"

    const/4 v4, 0x6

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ShowsRecyclerViewFragment"

    const/4 v4, 0x7

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ShowEpisodesRecyclerViewFragment"

    const/16 v4, 0x8

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ShowEpisodeActivity"

    const/16 v4, 0x9

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.VideoEpisodeFragment"

    const/16 v4, 0xa

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.VideoEpisodesRecyclerViewFragment"

    const/16 v4, 0xb

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.GalleryPhotosActivity"

    const/16 v4, 0xc

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.GalleriesRecyclerViewFragment"

    const/16 v4, 0xd

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ChannelFragment"

    const/16 v4, 0xe

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ChannelsFragment"

    const/16 v4, 0xf

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.InVisionViewPagerFragment"

    const/16 v4, 0x10

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.MainActivity"

    const/16 v4, 0x11

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ArticlesAdapter"

    const/16 v4, 0x12

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.RateAppViewHolder"

    const/16 v4, 0x13

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ChromecastActivity"

    const/16 v4, 0x14

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.OpedgeFragment"

    const/16 v4, 0x15

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.wear.GetNewsTask"

    const/16 v4, 0x16

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.MediaFragment"

    const/16 v4, 0x17

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.MediaVideoRecyclerViewFragment"

    const/16 v4, 0x18

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.MediaGalleriesRecyclerViewFragment"

    const/16 v4, 0x19

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.ViralFragment"

    const/16 v4, 0x1a

    aput-object v1, v0, v4

    const-string v1, "members/com.rt.mobile.english.ui.NoticiasFragment"

    const/16 v4, 0x1b

    aput-object v1, v0, v4

    sput-object v0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->INJECTS:[Ljava/lang/String;

    .line 18
    new-array v0, v2, [Ljava/lang/Class;

    sput-object v0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->STATIC_INJECTIONS:[Ljava/lang/Class;

    .line 19
    new-array v0, v3, [Ljava/lang/Class;

    const-class v1, Lcom/rt/mobile/english/data/ApiModule;

    aput-object v1, v0, v2

    sput-object v0, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->INCLUDES:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 22
    const-class v1, Lcom/rt/mobile/english/data/DataModule;

    sget-object v2, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->INJECTS:[Ljava/lang/String;

    sget-object v3, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->STATIC_INJECTIONS:[Ljava/lang/Class;

    sget-object v5, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->INCLUDES:[Ljava/lang/Class;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Ldagger/internal/ModuleAdapter;-><init>(Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;Z[Ljava/lang/Class;ZZ)V

    return-void
.end method


# virtual methods
.method public getBindings(Ldagger/internal/BindingsGroup;Lcom/rt/mobile/english/data/DataModule;)V
    .locals 2

    const-string v0, "@javax.inject.Named(value=json)/com.squareup.okhttp.OkHttpClient"

    .line 36
    new-instance v1, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideOkHttpJsonClientProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideOkHttpJsonClientProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/DataModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "@javax.inject.Named(value=img)/com.squareup.okhttp.OkHttpClient"

    .line 37
    new-instance v1, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideOkHttpImageClientProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideOkHttpImageClientProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/DataModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.squareup.picasso.Picasso"

    .line 38
    new-instance v1, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvidePicassoProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/DataModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.EditionManager"

    .line 39
    new-instance v1, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideEditionsProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/DataModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.data.AppEventCounter"

    .line 40
    new-instance v1, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideAppEventCounterProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideAppEventCounterProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/DataModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    const-string v0, "com.rt.mobile.english.ui.widget.ChromeCast"

    .line 41
    new-instance v1, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;

    invoke-direct {v1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter$ProvideChromeCastProvidesAdapter;-><init>(Lcom/rt/mobile/english/data/DataModule;)V

    invoke-virtual {p1, v0, v1}, Ldagger/internal/BindingsGroup;->contributeProvidesBinding(Ljava/lang/String;Ldagger/internal/ProvidesBinding;)Ldagger/internal/Binding;

    return-void
.end method

.method public bridge synthetic getBindings(Ldagger/internal/BindingsGroup;Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p2, Lcom/rt/mobile/english/data/DataModule;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->getBindings(Ldagger/internal/BindingsGroup;Lcom/rt/mobile/english/data/DataModule;)V

    return-void
.end method

.method public newModule()Lcom/rt/mobile/english/data/DataModule;
    .locals 1

    .line 27
    new-instance v0, Lcom/rt/mobile/english/data/DataModule;

    invoke-direct {v0}, Lcom/rt/mobile/english/data/DataModule;-><init>()V

    return-object v0
.end method

.method public bridge synthetic newModule()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/DataModule$$ModuleAdapter;->newModule()Lcom/rt/mobile/english/data/DataModule;

    move-result-object v0

    return-object v0
.end method
