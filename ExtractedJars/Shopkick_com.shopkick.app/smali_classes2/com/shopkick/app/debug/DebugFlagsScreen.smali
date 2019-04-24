.class public Lcom/shopkick/app/debug/DebugFlagsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "DebugFlagsScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private debugAccText:Landroid/widget/EditText;

.field private debugLatText:Landroid/widget/EditText;

.field private debugLngText:Landroid/widget/EditText;

.field private flags:Lcom/shopkick/app/flags/SKFlags;

.field private gpsClick:Landroid/view/View$OnClickListener;

.field private gpsCoordContainer:Landroid/view/View;

.field private presenceController:Lcom/shopkick/app/presence/PresenceController;

.field private storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 144
    new-instance v0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/debug/DebugFlagsScreen$1;-><init>(Lcom/shopkick/app/debug/DebugFlagsScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/debug/DebugFlagsScreen;)Landroid/widget/EditText;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugLatText:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/debug/DebugFlagsScreen;)Landroid/widget/EditText;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugLngText:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/debug/DebugFlagsScreen;)Landroid/widget/EditText;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugAccText:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/flags/SKFlags;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/presence/PresenceController;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/location/StoreNearbyNotifier;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    return-object p0
.end method

.method private createFlagCheckBox(Ljava/lang/String;Landroid/content/Context;)Landroid/widget/CheckBox;
    .locals 3

    .line 106
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/16 v2, 0x3c

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xb

    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xf

    .line 108
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v1, 0x0

    const/16 v2, 0x19

    .line 109
    invoke-virtual {v0, v1, v1, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 110
    new-instance v1, Landroid/widget/CheckBox;

    invoke-direct {v1, p2}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 111
    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {v1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 113
    invoke-virtual {v1, p1}, Landroid/widget/CheckBox;->setTag(Ljava/lang/Object;)V

    .line 114
    invoke-virtual {v1, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v1
.end method

.method private createFlagContainer(Ljava/lang/String;Landroid/content/Context;)Landroid/widget/RelativeLayout;
    .locals 4

    .line 74
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 75
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/16 v3, 0x64

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xa

    const/4 v3, 0x0

    .line 77
    invoke-virtual {v1, v3, v2, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x7f06015d

    .line 79
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    const/4 v1, 0x5

    .line 80
    invoke-virtual {v0, v3, v1, v3, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 82
    iget-object v1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/flags/SKFlags;->getFlagDescription(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/shopkick/app/debug/DebugFlagsScreen;->createFlagLabel(Ljava/lang/String;Landroid/content/Context;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 83
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/debug/DebugFlagsScreen;->createFlagCheckBox(Ljava/lang/String;Landroid/content/Context;)Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method private createFlagLabel(Ljava/lang/String;Landroid/content/Context;)Landroid/widget/TextView;
    .locals 3

    .line 90
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 91
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p2, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xf

    .line 94
    invoke-virtual {p2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0x9

    .line 95
    invoke-virtual {p2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v1, 0x0

    const/16 v2, 0x14

    .line 96
    invoke-virtual {p2, v2, v1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 97
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 p1, 0x41800000    # 16.0f

    .line 98
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/high16 p1, -0x1000000

    .line 99
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x3

    .line 100
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 101
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private createGpsCoordContainer(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const v0, 0x7f0c008d

    const/4 v1, 0x0

    .line 130
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsCoordContainer:Landroid/view/View;

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsCoordContainer:Landroid/view/View;

    const p2, 0x7f090407

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugLatText:Landroid/widget/EditText;

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugLatText:Landroid/widget/EditText;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    sget-object v1, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LAT:Ljava/lang/String;

    const v2, 0x4215c955

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 133
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsCoordContainer:Landroid/view/View;

    const p2, 0x7f090430

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugLngText:Landroid/widget/EditText;

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugLngText:Landroid/widget/EditText;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    sget-object v1, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LNG:Ljava/lang/String;

    const v2, -0x3d0bae39

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsCoordContainer:Landroid/view/View;

    const p2, 0x7f090008

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugAccText:Landroid/widget/EditText;

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->debugAccText:Landroid/widget/EditText;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    sget-object v1, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_ACCURACY:Ljava/lang/String;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsCoordContainer:Landroid/view/View;

    const p2, 0x7f090673

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 138
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugFlagsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p2

    const-string v0, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {p2, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2

    .line 139
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V

    .line 140
    iget-object p2, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->gpsCoordContainer:Landroid/view/View;

    return-object p1
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const-string p2, "Flags Screen"

    .line 54
    invoke-virtual {p0, p2}, Lcom/shopkick/app/debug/DebugFlagsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    const p2, 0x7f0c0090

    const/4 p3, 0x0

    .line 55
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ScrollView;

    const p3, 0x7f0901d1

    .line 56
    invoke-virtual {p2, p3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout;

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    invoke-virtual {v0}, Lcom/shopkick/app/flags/SKFlags;->getFlags()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 59
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 61
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugFlagsScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/shopkick/app/debug/DebugFlagsScreen;->createFlagContainer(Ljava/lang/String;Landroid/content/Context;)Landroid/widget/RelativeLayout;

    move-result-object v3

    .line 62
    invoke-virtual {p3, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    const-string v3, "DEBUG_FLAG_USE_PROVIDED_GPS"

    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 64
    invoke-direct {p0, p1, p3}, Lcom/shopkick/app/debug/DebugFlagsScreen;->createGpsCoordContainer(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/debug/DebugFlagsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->storeNearbyNotifier:Lcom/shopkick/app/location/StoreNearbyNotifier;

    return-object p2
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 48
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    .line 49
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen;->flags:Lcom/shopkick/app/flags/SKFlags;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/flags/SKFlags;->toggleFlag(Ljava/lang/String;)V

    return-void
.end method
