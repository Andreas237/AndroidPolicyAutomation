.class public Lo/apa;
.super Lo/aoy;
.source "SourceFile"


# instance fields
.field private final b:Ljava/util/regex/Pattern;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 33
    invoke-direct {p0}, Lo/aoy;-><init>()V

    .line 28
    const-string v0, "^(http|https|rtsp|):\\/\\/.*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lo/apa;->b:Ljava/util/regex/Pattern;

    .line 34
    iput-object p1, p0, Lo/apa;->c:Ljava/lang/String;

    .line 35
    iput p2, p0, Lo/apa;->d:I

    .line 36
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 4

    .line 41
    iget-object v0, p0, Lo/apa;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v0, ""

    return-object v0

    .line 47
    :cond_0
    iget-object v0, p0, Lo/apa;->b:Ljava/util/regex/Pattern;

    iget-object v1, p0, Lo/apa;->c:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-nez v0, :cond_1

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/apa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 55
    :cond_1
    iget-object v0, p0, Lo/apa;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    .line 56
    iget-object v0, p0, Lo/apa;->c:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 65
    .line 66
    invoke-virtual {p0}, Lo/apa;->e()Ljava/lang/String;

    move-result-object v0

    .line 65
    const/16 v1, 0x9

    const/16 v2, 0x7e9

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v0}, Lo/apf;->a(IIILjava/lang/Object;)V

    .line 67
    return-void
.end method
