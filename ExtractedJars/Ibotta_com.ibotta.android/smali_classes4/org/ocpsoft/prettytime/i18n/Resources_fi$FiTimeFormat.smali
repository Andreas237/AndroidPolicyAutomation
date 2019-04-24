.class Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
.super Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
.source "Resources_fi.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/ocpsoft/prettytime/i18n/Resources_fi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FiTimeFormat"
.end annotation


# instance fields
.field private final bundle:Ljava/util/ResourceBundle;

.field private futureName:Ljava/lang/String;

.field private futurePluralName:Ljava/lang/String;

.field private pastName:Ljava/lang/String;

.field private pastPluralName:Ljava/lang/String;

.field private pluralPattern:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/ResourceBundle;Lorg/ocpsoft/prettytime/TimeUnit;)V
    .locals 3

    .line 133
    invoke-direct {p0}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;-><init>()V

    const-string v0, ""

    .line 125
    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pastName:Ljava/lang/String;

    const-string v0, ""

    .line 126
    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->futureName:Ljava/lang/String;

    const-string v0, ""

    .line 127
    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pastPluralName:Ljava/lang/String;

    const-string v0, ""

    .line 128
    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->futurePluralName:Ljava/lang/String;

    const-string v0, ""

    .line 129
    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pluralPattern:Ljava/lang/String;

    .line 134
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    .line 136
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastSingularName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 137
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastSingularName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setPastName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    move-result-object p1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "FutureSingularName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setFutureName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    move-result-object p1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PastSingularName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setPastPluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    move-result-object p1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "FutureSingularName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setFuturePluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    move-result-object p1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Pattern"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setPluralPattern(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    .line 143
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastPluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PastPluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setPastPluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    .line 147
    :cond_0
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FuturePluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 148
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "FuturePluralName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setFuturePluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    .line 151
    :cond_1
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PluralPattern"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 152
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "PluralPattern"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setPluralPattern(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    .line 155
    :cond_2
    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Pattern"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->setPattern(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    move-result-object p1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PastSuffix"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->setPastSuffix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    move-result-object p1

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->bundle:Ljava/util/ResourceBundle;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "FutureSuffix"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->setFutureSuffix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->setFuturePrefix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->setPastPrefix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->setSingularName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->setPluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;

    :cond_3
    return-void
.end method

.method private getUnitName(Lorg/ocpsoft/prettytime/TimeUnit;)Ljava/lang/String;
    .locals 0

    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public decorate(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 232
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->getUnit()Lorg/ocpsoft/prettytime/TimeUnit;

    move-result-object v0

    instance-of v0, v0, Lorg/ocpsoft/prettytime/units/Day;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->getQuantity()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 235
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->decorate(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    return-object p2
.end method

.method public getFutureName()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->futureName:Ljava/lang/String;

    return-object v0
.end method

.method public getFuturePluralName()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->futurePluralName:Ljava/lang/String;

    return-object v0
.end method

.method protected getGramaticallyCorrectName(Lorg/ocpsoft/prettytime/Duration;Z)Ljava/lang/String;
    .locals 6

    .line 212
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getPastName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getFutureName()Ljava/lang/String;

    move-result-object v0

    .line 213
    :goto_0
    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getQuantity(Lorg/ocpsoft/prettytime/Duration;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getQuantity(Lorg/ocpsoft/prettytime/Duration;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long p2, v1, v3

    if-lez p2, :cond_3

    .line 215
    :cond_1
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getPastPluralName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getFuturePluralName()Ljava/lang/String;

    move-result-object p1

    :goto_1
    move-object v0, p1

    :cond_3
    return-object v0
.end method

.method public getPastName()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pastName:Ljava/lang/String;

    return-object v0
.end method

.method public getPastPluralName()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pastPluralName:Ljava/lang/String;

    return-object v0
.end method

.method protected getPattern(J)Ljava/lang/String;
    .locals 3

    .line 222
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    const-wide/16 v0, 0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 223
    invoke-virtual {p0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getPattern()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 225
    :cond_0
    invoke-virtual {p0}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->getPluralPattern()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPluralPattern()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pluralPattern:Ljava/lang/String;

    return-object v0
.end method

.method public setFutureName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    .locals 0

    .line 191
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->futureName:Ljava/lang/String;

    return-object p0
.end method

.method public setFuturePluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    .locals 0

    .line 201
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->futurePluralName:Ljava/lang/String;

    return-object p0
.end method

.method public setPastName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    .locals 0

    .line 186
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pastName:Ljava/lang/String;

    return-object p0
.end method

.method public setPastPluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    .locals 0

    .line 196
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pastPluralName:Ljava/lang/String;

    return-object p0
.end method

.method public setPluralPattern(Ljava/lang/String;)Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    .locals 0

    .line 206
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;->pluralPattern:Ljava/lang/String;

    return-object p0
.end method
