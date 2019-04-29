.class Lcom/mopub/mobileads/VastResource;
.super Ljava/lang/Object;
.source "VastResource.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/VastResource$CreativeType;,
        Lcom/mopub/mobileads/VastResource$Type;
    }
.end annotation


# static fields
.field private static final VALID_APPLICATION_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final VALID_IMAGE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J


# instance fields
.field private mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mHeight:I

.field private mResource:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mType:Lcom/mopub/mobileads/VastResource$Type;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x4

    .line 18
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "image/jpeg"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "image/png"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "image/bmp"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "image/gif"

    const/4 v4, 0x3

    aput-object v1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/VastResource;->VALID_IMAGE_TYPES:Ljava/util/List;

    .line 20
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "application/x-javascript"

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/VastResource;->VALID_APPLICATION_TYPES:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/mopub/mobileads/VastResource$Type;Lcom/mopub/mobileads/VastResource$CreativeType;II)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastResource$Type;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/mobileads/VastResource$CreativeType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 124
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 125
    invoke-static {p3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 127
    iput-object p1, p0, Lcom/mopub/mobileads/VastResource;->mResource:Ljava/lang/String;

    .line 128
    iput-object p2, p0, Lcom/mopub/mobileads/VastResource;->mType:Lcom/mopub/mobileads/VastResource$Type;

    .line 129
    iput-object p3, p0, Lcom/mopub/mobileads/VastResource;->mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;

    .line 130
    iput p4, p0, Lcom/mopub/mobileads/VastResource;->mWidth:I

    .line 131
    iput p5, p0, Lcom/mopub/mobileads/VastResource;->mHeight:I

    return-void
.end method

.method static fromVastResourceXmlManager(Lcom/mopub/mobileads/VastResourceXmlManager;II)Lcom/mopub/mobileads/VastResource;
    .locals 4
    .param p0    # Lcom/mopub/mobileads/VastResourceXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 60
    invoke-static {}, Lcom/mopub/mobileads/VastResource$Type;->values()[Lcom/mopub/mobileads/VastResource$Type;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 61
    invoke-static {p0, v3, p1, p2}, Lcom/mopub/mobileads/VastResource;->fromVastResourceXmlManager(Lcom/mopub/mobileads/VastResourceXmlManager;Lcom/mopub/mobileads/VastResource$Type;II)Lcom/mopub/mobileads/VastResource;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method static fromVastResourceXmlManager(Lcom/mopub/mobileads/VastResourceXmlManager;Lcom/mopub/mobileads/VastResource$Type;II)Lcom/mopub/mobileads/VastResource;
    .locals 7
    .param p0    # Lcom/mopub/mobileads/VastResourceXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/mopub/mobileads/VastResource$Type;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 84
    invoke-static {p0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 85
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 87
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastResourceXmlManager;->getIFrameResource()Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastResourceXmlManager;->getHTMLResource()Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastResourceXmlManager;->getStaticResource()Ljava/lang/String;

    move-result-object v2

    .line 90
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastResourceXmlManager;->getStaticResourceType()Ljava/lang/String;

    move-result-object p0

    .line 95
    sget-object v3, Lcom/mopub/mobileads/VastResource$Type;->STATIC_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne p1, v3, :cond_2

    if-eqz v2, :cond_2

    if-eqz p0, :cond_2

    sget-object v3, Lcom/mopub/mobileads/VastResource;->VALID_IMAGE_TYPES:Ljava/util/List;

    invoke-interface {v3, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/mopub/mobileads/VastResource;->VALID_APPLICATION_TYPES:Ljava/util/List;

    invoke-interface {v3, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 100
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/VastResource;->VALID_IMAGE_TYPES:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 101
    sget-object p0, Lcom/mopub/mobileads/VastResource$CreativeType;->IMAGE:Lcom/mopub/mobileads/VastResource$CreativeType;

    :goto_0
    move-object v4, p0

    goto :goto_1

    .line 103
    :cond_1
    sget-object p0, Lcom/mopub/mobileads/VastResource$CreativeType;->JAVASCRIPT:Lcom/mopub/mobileads/VastResource$CreativeType;

    goto :goto_0

    .line 105
    :cond_2
    sget-object p0, Lcom/mopub/mobileads/VastResource$Type;->HTML_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne p1, p0, :cond_3

    if-eqz v1, :cond_3

    .line 107
    sget-object p0, Lcom/mopub/mobileads/VastResource$CreativeType;->NONE:Lcom/mopub/mobileads/VastResource$CreativeType;

    move-object v4, p0

    move-object v2, v1

    goto :goto_1

    .line 108
    :cond_3
    sget-object p0, Lcom/mopub/mobileads/VastResource$Type;->IFRAME_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne p1, p0, :cond_4

    if-eqz v0, :cond_4

    .line 110
    sget-object p0, Lcom/mopub/mobileads/VastResource$CreativeType;->NONE:Lcom/mopub/mobileads/VastResource$CreativeType;

    move-object v4, p0

    move-object v2, v0

    .line 115
    :goto_1
    new-instance p0, Lcom/mopub/mobileads/VastResource;

    move-object v1, p0

    move-object v3, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/mopub/mobileads/VastResource;-><init>(Ljava/lang/String;Lcom/mopub/mobileads/VastResource$Type;Lcom/mopub/mobileads/VastResource$CreativeType;II)V

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getCorrectClickThroughUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 195
    sget-object v0, Lcom/mopub/mobileads/VastResource$1;->$SwitchMap$com$mopub$mobileads$VastResource$Type:[I

    iget-object v1, p0, Lcom/mopub/mobileads/VastResource;->mType:Lcom/mopub/mobileads/VastResource$Type;

    invoke-virtual {v1}, Lcom/mopub/mobileads/VastResource$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    return-object v1

    :pswitch_0
    return-object p2

    .line 197
    :pswitch_1
    sget-object v0, Lcom/mopub/mobileads/VastResource$CreativeType;->IMAGE:Lcom/mopub/mobileads/VastResource$CreativeType;

    iget-object v2, p0, Lcom/mopub/mobileads/VastResource;->mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;

    if-ne v0, v2, :cond_0

    return-object p1

    .line 199
    :cond_0
    sget-object p1, Lcom/mopub/mobileads/VastResource$CreativeType;->JAVASCRIPT:Lcom/mopub/mobileads/VastResource$CreativeType;

    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;

    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getCreativeType()Lcom/mopub/mobileads/VastResource$CreativeType;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 146
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;

    return-object v0
.end method

.method public getResource()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mResource:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/mopub/mobileads/VastResource$Type;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mType:Lcom/mopub/mobileads/VastResource$Type;

    return-object v0
.end method

.method public initializeWebView(Lcom/mopub/mobileads/VastWebView;)V
    .locals 2
    .param p1    # Lcom/mopub/mobileads/VastWebView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 155
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mType:Lcom/mopub/mobileads/VastResource$Type;

    sget-object v1, Lcom/mopub/mobileads/VastResource$Type;->IFRAME_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne v0, v1, :cond_0

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mopub/mobileads/VastResource;->mWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\" height=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mopub/mobileads/VastResource;->mHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\" src=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mopub/mobileads/VastResource;->mResource:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"></iframe>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastWebView;->loadData(Ljava/lang/String;)V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mType:Lcom/mopub/mobileads/VastResource$Type;

    sget-object v1, Lcom/mopub/mobileads/VastResource$Type;->HTML_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne v0, v1, :cond_1

    .line 162
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mResource:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastWebView;->loadData(Ljava/lang/String;)V

    goto :goto_0

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mType:Lcom/mopub/mobileads/VastResource$Type;

    sget-object v1, Lcom/mopub/mobileads/VastResource$Type;->STATIC_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne v0, v1, :cond_3

    .line 164
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;

    sget-object v1, Lcom/mopub/mobileads/VastResource$CreativeType;->IMAGE:Lcom/mopub/mobileads/VastResource$CreativeType;

    if-ne v0, v1, :cond_2

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<html><head></head><body style=\"margin:0;padding:0\"><img src=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mopub/mobileads/VastResource;->mResource:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" />"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "</body>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "</html>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastWebView;->loadData(Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_2
    iget-object v0, p0, Lcom/mopub/mobileads/VastResource;->mCreativeType:Lcom/mopub/mobileads/VastResource$CreativeType;

    sget-object v1, Lcom/mopub/mobileads/VastResource$CreativeType;->JAVASCRIPT:Lcom/mopub/mobileads/VastResource$CreativeType;

    if-ne v0, v1, :cond_3

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<script src=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mopub/mobileads/VastResource;->mResource:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"></script>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastWebView;->loadData(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
