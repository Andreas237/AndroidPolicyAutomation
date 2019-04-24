.class public Lorg/jdom2/filter/ContentFilter;
.super Lorg/jdom2/filter/AbstractFilter;
.source "ContentFilter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jdom2/filter/AbstractFilter<",
        "Lorg/jdom2/Content;",
        ">;"
    }
.end annotation


# static fields
.field public static final CDATA:I = 0x2

.field public static final COMMENT:I = 0x8

.field public static final DOCTYPE:I = 0x80

.field public static final DOCUMENT:I = 0x40

.field public static final ELEMENT:I = 0x1

.field public static final ENTITYREF:I = 0x20

.field public static final PI:I = 0x10

.field public static final TEXT:I = 0x4

.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private filterMask:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 119
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    .line 120
    invoke-virtual {p0}, Lorg/jdom2/filter/ContentFilter;->setDefaultMask()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 143
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    .line 144
    invoke-virtual {p0, p1}, Lorg/jdom2/filter/ContentFilter;->setFilterMask(I)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 129
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    if-eqz p1, :cond_0

    .line 131
    invoke-virtual {p0}, Lorg/jdom2/filter/ContentFilter;->setDefaultMask()V

    goto :goto_0

    .line 134
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    not-int v0, p1

    and-int/2addr p1, v0

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 350
    :cond_0
    instance-of v1, p1, Lorg/jdom2/filter/ContentFilter;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 352
    :cond_1
    check-cast p1, Lorg/jdom2/filter/ContentFilter;

    .line 354
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    iget p1, p1, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic filter(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 82
    invoke-virtual {p0, p1}, Lorg/jdom2/filter/ContentFilter;->filter(Ljava/lang/Object;)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public filter(Ljava/lang/Object;)Lorg/jdom2/Content;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_f

    .line 305
    const-class v1, Lorg/jdom2/Content;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_7

    .line 309
    :cond_0
    check-cast p1, Lorg/jdom2/Content;

    .line 311
    instance-of v1, p1, Lorg/jdom2/Element;

    if-eqz v1, :cond_2

    .line 312
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    return-object p1

    .line 314
    :cond_2
    instance-of v1, p1, Lorg/jdom2/CDATA;

    if-eqz v1, :cond_4

    .line 315
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    return-object p1

    .line 317
    :cond_4
    instance-of v1, p1, Lorg/jdom2/Text;

    if-eqz v1, :cond_6

    .line 318
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v0

    :goto_2
    return-object p1

    .line 320
    :cond_6
    instance-of v1, p1, Lorg/jdom2/Comment;

    if-eqz v1, :cond_8

    .line 321
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v0

    :goto_3
    return-object p1

    .line 323
    :cond_8
    instance-of v1, p1, Lorg/jdom2/ProcessingInstruction;

    if-eqz v1, :cond_a

    .line 324
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    move-object p1, v0

    :goto_4
    return-object p1

    .line 326
    :cond_a
    instance-of v1, p1, Lorg/jdom2/EntityRef;

    if-eqz v1, :cond_c

    .line 327
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    move-object p1, v0

    :goto_5
    return-object p1

    .line 332
    :cond_c
    instance-of v1, p1, Lorg/jdom2/DocType;

    if-eqz v1, :cond_e

    .line 333
    iget v1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_d

    goto :goto_6

    :cond_d
    move-object p1, v0

    :goto_6
    return-object p1

    :cond_e
    return-object v0

    :cond_f
    :goto_7
    return-object v0
.end method

.method public getFilterMask()I
    .locals 1

    .line 153
    iget v0, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 362
    iget v0, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    return v0
.end method

.method public setCDATAVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 214
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 217
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 p1, p1, -0x3

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method

.method public setCommentVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 244
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 247
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 p1, p1, -0x9

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method

.method public setDefaultMask()V
    .locals 1

    const/16 v0, 0xff

    .line 170
    iput v0, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    return-void
.end method

.method public setDocTypeVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 289
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 292
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit16 p1, p1, -0x81

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method

.method public setDocumentContent()V
    .locals 1

    const/16 v0, 0x99

    .line 179
    iput v0, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    return-void
.end method

.method public setElementContent()V
    .locals 1

    const/16 v0, 0x3f

    .line 187
    iput v0, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    return-void
.end method

.method public setElementVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 199
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 202
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method

.method public setEntityRefVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 274
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 277
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method

.method public setFilterMask(I)V
    .locals 1

    .line 162
    invoke-virtual {p0}, Lorg/jdom2/filter/ContentFilter;->setDefaultMask()V

    .line 163
    iget v0, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/2addr p1, v0

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    return-void
.end method

.method public setPIVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 259
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 262
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method

.method public setTextVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 229
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    goto :goto_0

    .line 232
    :cond_0
    iget p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    and-int/lit8 p1, p1, -0x5

    iput p1, p0, Lorg/jdom2/filter/ContentFilter;->filterMask:I

    :goto_0
    return-void
.end method
