.class public Lcom/usebutton/sdk/internal/models/UrlMatcher;
.super Ljava/lang/Object;
.source "UrlMatcher.java"


# static fields
.field private static final PARTNER_SUBDOMAIN_REGEX:Ljava/lang/String; = "^(?:track\\.bttn\\.io\\/([^\\/]+).*|(?!track)([^\\.]+)\\.bttn\\.io(?:\\/.*|$))"


# instance fields
.field private final configurationGetter:Lcom/usebutton/sdk/internal/functional/Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private linksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/functional/Getter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->configurationGetter:Lcom/usebutton/sdk/internal/functional/Getter;

    return-void
.end method

.method private extractCandidateHostname(Ljava/net/URL;)Ljava/lang/String;
    .locals 2

    .line 298
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    const-string v0, "www."

    .line 299
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "www."

    const-string v1, ""

    .line 300
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p1
.end method

.method private extractPartnerSubdomain(Ljava/net/URL;)Ljava/lang/String;
    .locals 2

    .line 311
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 312
    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "/"

    .line 313
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "^(?:track\\.bttn\\.io\\/([^\\/]+).*|(?!track)([^\\.]+)\\.bttn\\.io(?:\\/.*|$))"

    .line 314
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 315
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 317
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 318
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 319
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    .line 321
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "\\."

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v0

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private getUrlMatches(Ljava/util/regex/Matcher;)[Ljava/lang/String;
    .locals 4

    .line 287
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 288
    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 289
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    move v1, v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private hasMatchingAffiliatePathnameIdPattern(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;Z)Z
    .locals 5

    if-nez p3, :cond_0

    .line 252
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->getPathnameIds()Ljava/util/List;

    move-result-object p2

    goto :goto_1

    .line 254
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 255
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->getPathnameIds()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;

    .line 256
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->isGuaranteedAction()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 257
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p2, p3

    .line 262
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;

    .line 263
    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->getRegex()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 264
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    .line 268
    :cond_4
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->getUrlMatches(Ljava/util/regex/Matcher;)[Ljava/lang/String;

    move-result-object v1

    .line 269
    array-length v2, v1

    const/4 v3, 0x1

    if-nez v2, :cond_5

    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->getMatches()[[Ljava/lang/String;

    move-result-object v2

    array-length v2, v2

    if-nez v2, :cond_5

    return v3

    .line 273
    :cond_5
    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$PathnameId;->getMatches()[[Ljava/lang/String;

    move-result-object p3

    array-length v2, p3

    :goto_3
    if-ge v0, v2, :cond_3

    aget-object v4, p3, v0

    .line 274
    invoke-static {v4, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    return v3

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    return v0
.end method

.method private hasMatchingAffiliateQueryIdValue(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;Z)Z
    .locals 3

    if-nez p3, :cond_0

    .line 219
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->getQueryIds()Ljava/util/List;

    move-result-object p2

    goto :goto_1

    .line 221
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 222
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->getQueryIds()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;

    .line 223
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->isGuaranteedAction()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 224
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p2, p3

    .line 229
    :goto_1
    invoke-static {p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->splitQuery(Ljava/net/URL;)Ljava/util/Map;

    move-result-object p1

    .line 230
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;

    .line 231
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 232
    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 233
    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$QueryId;->getValues()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 234
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method private hasMatchingAffiliateQueryUrlKey(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;)Z
    .locals 1

    .line 200
    invoke-static {p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->splitQuery(Ljava/net/URL;)Ljava/util/Map;

    move-result-object p1

    .line 201
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->getQueryUrlKeys()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 202
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private isInvalidHost(Ljava/net/URL;)Z
    .locals 2

    .line 130
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to match url. No hostname specified: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private isInvalidLinksConfig()Z
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->linksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    if-nez v0, :cond_0

    const-string v0, "There are no supported merchants for matching. Please contact Button if this is unexpected."

    .line 91
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isInvalidProtocol(Ljava/net/URL;)Z
    .locals 2

    const-string v0, "http"

    .line 117
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to match url. Unsupported protocol: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private isInvalidUrl(Ljava/net/URL;)Z
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "Unable to match url. Url cannot be null."

    .line 105
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private isSupportedAffiliateLink(Ljava/net/URL;Z)Z
    .locals 5

    .line 175
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->extractCandidateHostname(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v0

    .line 176
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->linksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->getSupportedAffiliates()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;

    .line 177
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;->getHostname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 178
    invoke-direct {p0, p1, v2}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->hasMatchingAffiliateQueryUrlKey(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    return v4

    .line 181
    :cond_1
    invoke-direct {p0, p1, v2, p2}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->hasMatchingAffiliateQueryIdValue(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    return v4

    .line 184
    :cond_2
    invoke-direct {p0, p1, v2, p2}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->hasMatchingAffiliatePathnameIdPattern(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/LinksConfiguration$Affiliate;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    return v4

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private isSupportedHostname(Ljava/net/URL;)Z
    .locals 2

    .line 143
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->extractCandidateHostname(Ljava/net/URL;)Ljava/lang/String;

    move-result-object p1

    .line 144
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->linksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->getSupportedHostnames()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 145
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private isSupportedSubdomain(Ljava/net/URL;)Z
    .locals 2

    .line 159
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->extractPartnerSubdomain(Ljava/net/URL;)Ljava/lang/String;

    move-result-object p1

    .line 160
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->linksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;->getSupportedButtonSubdomains()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 161
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static splitQuery(Ljava/net/URL;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 332
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 333
    invoke-virtual {p0}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "&"

    .line 336
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 337
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    const-string v5, "="

    .line 338
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 340
    :try_start_0
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "UTF-8"

    invoke-static {v6, v7}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    .line 341
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "UTF-8"

    invoke-static {v4, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 340
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 343
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Error decoding url params: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public canExchangeUrl(Ljava/net/URL;)Z
    .locals 1

    const/4 v0, 0x1

    .line 37
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->canExchangeUrl(Ljava/net/URL;Z)Z

    move-result p1

    return p1
.end method

.method public canExchangeUrl(Ljava/net/URL;Z)Z
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->configurationGetter:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getLinks()Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/UrlMatcher;->linksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    .line 52
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isInvalidLinksConfig()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 56
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isInvalidUrl(Ljava/net/URL;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 60
    :cond_1
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isInvalidProtocol(Ljava/net/URL;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 64
    :cond_2
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isInvalidHost(Ljava/net/URL;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    .line 70
    :cond_3
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isSupportedHostname(Ljava/net/URL;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    return v2

    .line 74
    :cond_4
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isSupportedSubdomain(Ljava/net/URL;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v2

    .line 78
    :cond_5
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->isSupportedAffiliateLink(Ljava/net/URL;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v1
.end method
