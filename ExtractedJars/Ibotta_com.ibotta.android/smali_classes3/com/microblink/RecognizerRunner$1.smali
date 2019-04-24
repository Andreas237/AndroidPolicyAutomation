.class synthetic Lcom/microblink/RecognizerRunner$1;
.super Ljava/lang/Object;


# static fields
.field static final synthetic $SwitchMap$com$microblink$internal$country$Country:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/microblink/internal/country/Country;->values()[Lcom/microblink/internal/country/Country;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/microblink/RecognizerRunner$1;->$SwitchMap$com$microblink$internal$country$Country:[I

    :try_start_0
    sget-object v0, Lcom/microblink/RecognizerRunner$1;->$SwitchMap$com$microblink$internal$country$Country:[I

    sget-object v1, Lcom/microblink/internal/country/Country;->POLAND:Lcom/microblink/internal/country/Country;

    invoke-virtual {v1}, Lcom/microblink/internal/country/Country;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
