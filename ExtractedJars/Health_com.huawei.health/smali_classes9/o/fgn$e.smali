.class Lo/fgn$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fgn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:Ljava/lang/String;

.field d:I

.field e:Ljava/lang/String;


# direct methods
.method constructor <init>(I)V
    .locals 2

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 314
    const-string v0, "01.01"

    iput-object v0, p0, Lo/fgn$e;->e:Ljava/lang/String;

    .line 315
    iput p1, p0, Lo/fgn$e;->b:I

    .line 317
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fgn$e;->a:Ljava/lang/String;

    .line 318
    const/4 v0, 0x0

    iput v0, p0, Lo/fgn$e;->d:I

    .line 319
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fgn$e;->c:Ljava/lang/String;

    .line 320
    const-string v0, "CA"

    iget-object v1, p0, Lo/fgn$e;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AU"

    iget-object v1, p0, Lo/fgn$e;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    const-string v0, "US"

    iput-object v0, p0, Lo/fgn$e;->c:Ljava/lang/String;

    .line 323
    :cond_1
    return-void
.end method


# virtual methods
.method b()Ljava/lang/String;
    .locals 1

    .line 330
    iget v0, p0, Lo/fgn$e;->b:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method d()Ljava/lang/String;
    .locals 1

    .line 326
    iget v0, p0, Lo/fgn$e;->d:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
