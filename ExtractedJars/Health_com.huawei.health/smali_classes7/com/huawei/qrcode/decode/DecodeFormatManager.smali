.class final Lcom/huawei/qrcode/decode/DecodeFormatManager;
.super Ljava/lang/Object;


# static fields
.field private static final COMMA_PATTERN:Ljava/util/regex/Pattern;

.field static final DATA_MATRIX_FORMATS:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation
.end field

.field static final ONE_D_FORMATS:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation
.end field

.field static final PRODUCT_FORMATS:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation
.end field

.field static final QR_CODE_FORMATS:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->COMMA_PATTERN:Ljava/util/regex/Pattern;

    sget-object v0, Lo/od;->p:Lo/od;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->QR_CODE_FORMATS:Ljava/util/Collection;

    sget-object v0, Lo/od;->h:Lo/od;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->DATA_MATRIX_FORMATS:Ljava/util/Collection;

    sget-object v0, Lo/od;->m:Lo/od;

    const/4 v1, 0x5

    new-array v1, v1, [Lo/od;

    sget-object v2, Lo/od;->q:Lo/od;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->k:Lo/od;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->g:Lo/od;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->o:Lo/od;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->l:Lo/od;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->PRODUCT_FORMATS:Ljava/util/Collection;

    sget-object v0, Lo/od;->d:Lo/od;

    sget-object v1, Lo/od;->e:Lo/od;

    sget-object v2, Lo/od;->b:Lo/od;

    sget-object v3, Lo/od;->f:Lo/od;

    sget-object v4, Lo/od;->c:Lo/od;

    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->ONE_D_FORMATS:Ljava/util/Collection;

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->ONE_D_FORMATS:Ljava/util/Collection;

    sget-object v1, Lcom/huawei/qrcode/decode/DecodeFormatManager;->PRODUCT_FORMATS:Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static parseDecodeFormats(Landroid/content/Intent;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Intent;)Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation

    const/4 v1, 0x0

    const-string v0, "SCAN_FORMATS"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->COMMA_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_0
    const-string v0, "SCAN_MODE"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/qrcode/decode/DecodeFormatManager;->parseDecodeFormats(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method static parseDecodeFormats(Landroid/net/Uri;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/net/Uri;)Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation

    const-string v0, "SCAN_FORMATS"

    invoke-virtual {p0, v0}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->COMMA_PATTERN:Ljava/util/regex/Pattern;

    const/4 v1, 0x0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_0
    const-string v0, "SCAN_MODE"

    invoke-virtual {p0, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/qrcode/decode/DecodeFormatManager;->parseDecodeFormats(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private static parseDecodeFormats(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/util/Collection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<Ljava/lang/String;>;Ljava/lang/String;)Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    const-class v0, Lo/od;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v2

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lo/od;->valueOf(Ljava/lang/String;)Lo/od;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-object v2

    :catch_0
    move-exception v3

    const-string v0, "DecodeFormatManager IllegalArgumentException :"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_1
    if-eqz p1, :cond_5

    const-string v0, "PRODUCT_MODE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->PRODUCT_FORMATS:Ljava/util/Collection;

    return-object v0

    :cond_2
    const-string v0, "QR_CODE_MODE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->QR_CODE_FORMATS:Ljava/util/Collection;

    return-object v0

    :cond_3
    const-string v0, "DATA_MATRIX_MODE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->DATA_MATRIX_FORMATS:Ljava/util/Collection;

    return-object v0

    :cond_4
    const-string v0, "ONE_D_MODE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeFormatManager;->ONE_D_FORMATS:Ljava/util/Collection;

    return-object v0

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method
