.class Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;
.super Ljava/lang/Object;
.source "TwitterPinningInfoProvider.java"

# interfaces
.implements Lio/fabric/sdk/android/services/network/PinningInfoProvider;


# static fields
.field private static final PINS:[Ljava/lang/String;


# instance fields
.field private final appContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "VERISIGN_CLASS1"

    const-string v2, "2343d148a255899b947d461a797ec04cfed170b7"

    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS1_G3"

    const-string v2, "5519b278acb281d7eda7abc18399c3bb690424b5"

    .line 35
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS2_G2"

    const-string v2, "1237ba4517eead2926fdc1cdfebeedf2ded9145c"

    .line 36
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS2_G3"

    const-string v2, "5abec575dcaef3b08e271943fc7f250c3df661e3"

    .line 37
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS3"

    const-string v2, "e27f7bd877d5df9e0a3f9eb4cb0e2ea9efdb6977"

    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS3_G2"

    const-string v2, "1a21b4952b6293ce18b365ec9c0e934cb381e6d4"

    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS3_G3"

    const-string v2, "22f19e2ec6eaccfc5d2346f4c2e8f6c554dd5e07"

    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS3_G4"

    const-string v2, "ed663135d31bd4eca614c429e319069f94c12650"

    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS3_G5"

    const-string v2, "b181081a19a4c0941ffae89528c124c99b34acc7"

    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_CLASS4_G3"

    const-string v2, "3c03436868951cf3692ab8b426daba8fe922e5bd"

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "VERISIGN_UNIVERSAL"

    const-string v2, "bbc23e290bb328771dad3ea24dbdf423bd06b03d"

    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_GLOBAL"

    const-string v2, "c07a98688d89fbab05640c117daa7d65b8cacc4e"

    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_GLOBAL2"

    const-string v2, "713836f2023153472b6eba6546a9101558200509"

    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_PRIMARY"

    const-string v2, "b01989e7effb4aafcb148f58463976224150e1ba"

    .line 47
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_PRIMARY_G2"

    const-string v2, "bdbea71bab7157f9e475d954d2b727801a822682"

    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_PRIMARY_G3"

    const-string v2, "9ca98d00af740ddd8180d21345a58b8f2e9438d6"

    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_UNIVERAL"

    const-string v2, "87e85b6353c623a3128cb0ffbbf551fe59800e22"

    .line 50
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "GEOTRUST_UNIVERSAL2"

    const-string v2, "5e4f538685dd4f9eca5fdc0d456f7d51b1dc9b7b"

    .line 51
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "DIGICERT_GLOBAL_ROOT"

    const-string v2, "d52e13c1abe349dae8b49594ef7c3843606466bd"

    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "DIGICERT_EV_ROOT"

    const-string v2, "83317e62854253d6d7783190ec919056e991b9e3"

    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "DIGICERT_ASSUREDID_ROOT"

    const-string v2, "68330e61358521592983a3c8d2d2e1406e7ab3c1"

    .line 54
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "TWITTER1"

    const-string v2, "56fef3c2147d4ed38837fdbd3052387201e5778d"

    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 58
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;->PINS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;->appContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public getKeyStorePassword()Ljava/lang/String;
    .locals 1

    const-string v0, "changeit"

    return-object v0
.end method

.method public getKeyStoreStream()Ljava/io/InputStream;
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/twitter/sdk/android/core/R$raw;->tw__cacerts:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getPinCreationTimeInMillis()J
    .locals 2

    const-wide v0, 0x14f8a7681d5L

    return-wide v0
.end method

.method public getPins()[Ljava/lang/String;
    .locals 1

    .line 80
    sget-object v0, Lcom/twitter/sdk/android/core/TwitterPinningInfoProvider;->PINS:[Ljava/lang/String;

    return-object v0
.end method
