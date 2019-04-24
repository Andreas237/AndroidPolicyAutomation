.class public Lo/flp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;[Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/flp;->d:Ljava/util/HashMap;

    .line 69
    const-string v0, "unknown"

    const-string v1, "???"

    const/4 v2, -0x1

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, "text/plain"

    const-string v1, "txt"

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "text/csv"

    const-string v1, "csv"

    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v0, "text/html"

    const-string v1, "html"

    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "image/gif"

    const-string v1, "gif"

    const/16 v2, 0x15

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "image/jpeg"

    const-string v1, "jpg"

    const/16 v2, 0x16

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "image/png"

    const-string v1, "png"

    const/16 v2, 0x17

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "image/tiff"

    const-string v1, "tif"

    const/16 v2, 0x18

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, "application/link-format"

    const-string v1, "wlnk"

    const/16 v2, 0x28

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v0, "application/xml"

    const-string v1, "xml"

    const/16 v2, 0x29

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v0, "application/octet-stream"

    const-string v1, "bin"

    const/16 v2, 0x2a

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "application/rdf+xml"

    const-string v1, "rdf"

    const/16 v2, 0x2b

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "application/soap+xml"

    const-string v1, "soap"

    const/16 v2, 0x2c

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "application/atom+xml"

    const-string v1, "atom"

    const/16 v2, 0x2d

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "application/xmpp+xml"

    const-string v1, "xmpp"

    const/16 v2, 0x2e

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "application/exi"

    const-string v1, "exi"

    const/16 v2, 0x2f

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "application/fastinfoset"

    const-string v1, "finf"

    const/16 v2, 0x30

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "application/soap+fastinfoset"

    const-string v1, "soap.finf"

    const/16 v2, 0x31

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "application/json"

    const-string v1, "json"

    const/16 v2, 0x32

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string v0, "application/x-obix-binary"

    const-string v1, "obix"

    const/16 v2, 0x33

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "application/cbor"

    const-string v1, "cbor"

    const/16 v2, 0x3c

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "application/vnd.oma.lwm2m+tlv"

    const-string v1, "tlv"

    const/16 v2, 0x2d16

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "application/vnd.oma.lwm2m+json"

    const-string v1, "json"

    const/16 v2, 0x2d17

    invoke-static {v2, v0, v1}, Lo/flp;->c(ILjava/lang/String;Ljava/lang/String;)V

    .line 96
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(I)Ljava/lang/String;
    .locals 3

    .line 180
    sget-object v0, Lo/flp;->d:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Ljava/lang/String;

    .line 182
    if-eqz v2, :cond_0

    .line 183
    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0

    .line 185
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 190
    sget-object v0, Lo/flp;->d:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    return-void
.end method

.method public static d(I)Z
    .locals 1

    .line 105
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 120
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 136
    :goto_0
    :sswitch_1
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x0 -> :sswitch_0
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_0
        0x15 -> :sswitch_1
        0x16 -> :sswitch_1
        0x17 -> :sswitch_1
        0x18 -> :sswitch_1
        0x19 -> :sswitch_1
        0x1a -> :sswitch_1
        0x28 -> :sswitch_0
        0x29 -> :sswitch_0
        0x2a -> :sswitch_1
        0x2b -> :sswitch_0
        0x2c -> :sswitch_0
        0x2d -> :sswitch_0
        0x2e -> :sswitch_0
        0x2f -> :sswitch_1
        0x30 -> :sswitch_1
        0x31 -> :sswitch_1
        0x32 -> :sswitch_0
        0x33 -> :sswitch_1
        0x3c -> :sswitch_1
        0x2d16 -> :sswitch_1
        0x2d17 -> :sswitch_0
    .end sparse-switch
.end method
