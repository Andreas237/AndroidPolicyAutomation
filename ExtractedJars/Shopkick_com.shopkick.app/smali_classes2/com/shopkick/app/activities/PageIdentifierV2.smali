.class public Lcom/shopkick/app/activities/PageIdentifierV2;
.super Ljava/lang/Object;
.source "PageIdentifierV2.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/app/activities/PageIdentifierV2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private activityKey:Ljava/lang/String;

.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private primaryParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private screenKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2$1;

    invoke-direct {v0}, Lcom/shopkick/app/activities/PageIdentifierV2$1;-><init>()V

    sput-object v0, Lcom/shopkick/app/activities/PageIdentifierV2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    .line 207
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    .line 208
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object p1

    .line 209
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 210
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 211
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 213
    :cond_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/shopkick/app/activities/PageIdentifierV2$1;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {}, Lcom/shopkick/app/activities/ActivityInfo;->getInstance()Lcom/shopkick/app/activities/ActivityInfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/activities/ActivityInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    .line 50
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/screens/ScreenInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 54
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    .line 56
    :cond_0
    invoke-virtual {p0, p3}, Lcom/shopkick/app/activities/PageIdentifierV2;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    .line 63
    invoke-virtual {p0, p3}, Lcom/shopkick/app/activities/PageIdentifierV2;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method private createTag()Ljava/lang/String;
    .locals 2

    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "/"

    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "?"

    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    invoke-static {v1}, Lcom/shopkick/app/url/UriUtils;->queryString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private createUrl()Ljava/lang/String;
    .locals 2

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "sk"

    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "screen"

    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "/"

    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "?"

    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    invoke-static {v1}, Lcom/shopkick/app/url/UriUtils;->queryString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public clone()Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 4

    .line 244
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 17
    invoke-virtual {p0}, Lcom/shopkick/app/activities/PageIdentifierV2;->clone()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 166
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 170
    :cond_2
    check-cast p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 173
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    if-eqz v2, :cond_9

    iget-object v3, p1, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    .line 178
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v3, p1, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    .line 182
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    if-nez v2, :cond_5

    iget-object v2, p1, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    if-nez v2, :cond_6

    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    if-eqz v2, :cond_7

    iget-object p1, p1, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    .line 183
    invoke-interface {v2, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    move v0, v1

    :cond_7
    :goto_0
    return v0

    :cond_8
    :goto_1
    return v1

    :cond_9
    :goto_2
    return v1
.end method

.method public getActivityKey()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    return-object v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getPrimaryParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    return-object v0
.end method

.method public getScreenKey()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    add-int/2addr v0, v2

    mul-int/2addr v0, v2

    .line 151
    iget-object v3, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    .line 152
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 107
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    if-eqz p1, :cond_2

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 109
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 110
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/screens/ScreenInfo;->getPrimaryKeys(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 112
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 115
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->primaryParams:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public skUrl()Ljava/lang/String;
    .locals 1

    .line 138
    invoke-direct {p0}, Lcom/shopkick/app/activities/PageIdentifierV2;->createUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 143
    invoke-direct {p0}, Lcom/shopkick/app/activities/PageIdentifierV2;->createUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toTag()Ljava/lang/String;
    .locals 1

    .line 128
    invoke-direct {p0}, Lcom/shopkick/app/activities/PageIdentifierV2;->createTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 188
    iget-object p2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->activityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 189
    iget-object p2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->screenKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 190
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 192
    iget-object v2, p0, Lcom/shopkick/app/activities/PageIdentifierV2;->params:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 194
    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method
