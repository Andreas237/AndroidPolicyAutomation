.class public final Lorg/jivesoftware/smack/packet/Message;
.super Lorg/jivesoftware/smack/packet/Stanza;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/util/TypedCloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/Message$Type;,
        Lorg/jivesoftware/smack/packet/Message$Body;,
        Lorg/jivesoftware/smack/packet/Message$Subject;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/util/TypedCloneable<Lorg/jivesoftware/smack/packet/Message;>;"
    }
.end annotation


# static fields
.field public static final BODY:Ljava/lang/String; = "body"

.field public static final ELEMENT:Ljava/lang/String; = "message"


# instance fields
.field private final bodies:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lorg/jivesoftware/smack/packet/Message$Body;>;"
        }
    .end annotation
.end field

.field private channel:Ljava/lang/String;

.field private groupVersion:Ljava/lang/String;

.field private isUnRead:Z

.field private notify:I

.field private preSeq:J

.field private refer:Ljava/lang/String;

.field private seq:J

.field private final subjects:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lorg/jivesoftware/smack/packet/Message$Subject;>;"
        }
    .end annotation
.end field

.field private thread:Ljava/lang/String;

.field private ts:J

.field private type:Lorg/jivesoftware/smack/packet/Message$Type;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 194
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    .line 73
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->ts:J

    .line 93
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->seq:J

    .line 98
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->preSeq:J

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/packet/Message;->isUnRead:Z

    .line 108
    const/4 v0, 0x1

    iput v0, p0, Lorg/jivesoftware/smack/packet/Message;->notify:I

    .line 195
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 236
    invoke-static {p1}, Lo/ftj;->b(Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/jivesoftware/smack/packet/Message;-><init>(Lo/fte;Ljava/lang/String;)V

    .line 237
    return-void
.end method

.method public constructor <init>(Lo/fte;)V
    .locals 2

    .line 202
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    .line 73
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->ts:J

    .line 93
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->seq:J

    .line 98
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->preSeq:J

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/packet/Message;->isUnRead:Z

    .line 108
    const/4 v0, 0x1

    iput v0, p0, Lorg/jivesoftware/smack/packet/Message;->notify:I

    .line 203
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->setTo(Lo/fte;)V

    .line 204
    return-void
.end method

.method public constructor <init>(Lo/fte;Ljava/lang/String;)V
    .locals 0

    .line 224
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;-><init>(Lo/fte;)V

    .line 225
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/packet/Message;->setBody(Ljava/lang/String;)V

    .line 226
    return-void
.end method

.method public constructor <init>(Lo/fte;Lorg/jivesoftware/smack/packet/ExtensionElement;)V
    .locals 0

    .line 247
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;-><init>(Lo/fte;)V

    .line 248
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/packet/Message;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 249
    return-void
.end method

.method public constructor <init>(Lo/fte;Lorg/jivesoftware/smack/packet/Message$Type;)V
    .locals 0

    .line 213
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;-><init>(Lo/fte;)V

    .line 214
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/packet/Message;->setType(Lorg/jivesoftware/smack/packet/Message$Type;)V

    .line 215
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/Message;)V
    .locals 2

    .line 261
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;-><init>(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    .line 73
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->ts:J

    .line 93
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->seq:J

    .line 98
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->preSeq:J

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/packet/Message;->isUnRead:Z

    .line 108
    const/4 v0, 0x1

    iput v0, p0, Lorg/jivesoftware/smack/packet/Message;->notify:I

    .line 262
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 263
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    .line 264
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    iget-object v1, p1, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 265
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    iget-object v1, p1, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 266
    return-void
.end method

.method private determineLanguage(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 570
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    move-object p1, v0

    .line 573
    if-nez p1, :cond_1

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->language:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 574
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->language:Ljava/lang/String;

    return-object v0

    .line 576
    :cond_1
    if-nez p1, :cond_2

    .line 577
    invoke-static {}, Lorg/jivesoftware/smack/packet/Message;->getDefaultLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 580
    :cond_2
    return-object p1
.end method

.method private getMessageBody(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;
    .locals 3

    .line 437
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->determineLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 438
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/Message$Body;

    .line 439
    invoke-static {v2}, Lorg/jivesoftware/smack/packet/Message$Body;->access$400(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 440
    return-object v2

    .line 442
    :cond_0
    goto :goto_0

    .line 443
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private getMessageSubject(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;
    .locals 3

    .line 318
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->determineLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 319
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/Message$Subject;

    .line 320
    invoke-static {v2}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$100(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    return-object v2

    .line 323
    :cond_0
    goto :goto_0

    .line 324
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public addBody(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;
    .locals 2

    .line 497
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->determineLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 498
    new-instance v1, Lorg/jivesoftware/smack/packet/Message$Body;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p2, v0}, Lorg/jivesoftware/smack/packet/Message$Body;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/Message$3;)V

    .line 499
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 500
    return-object v1
.end method

.method public addSubject(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;
    .locals 2

    .line 360
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->determineLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 361
    new-instance v1, Lorg/jivesoftware/smack/packet/Message$Subject;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p2, v0}, Lorg/jivesoftware/smack/packet/Message$Subject;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/Message$3;)V

    .line 362
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 363
    return-object v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->clone()Lorg/jivesoftware/smack/packet/Message;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jivesoftware/smack/packet/Message;
    .locals 1

    .line 663
    new-instance v0, Lorg/jivesoftware/smack/packet/Message;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/packet/Message;-><init>(Lorg/jivesoftware/smack/packet/Message;)V

    return-object v0
.end method

.method public getBodies()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Lorg/jivesoftware/smack/packet/Message$Body;>;"
        }
    .end annotation

    .line 454
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 419
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->getBody(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBody(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 432
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->getMessageBody(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;

    move-result-object v1

    .line 433
    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lorg/jivesoftware/smack/packet/Message$Body;->access$300(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getBodyLanguages()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 537
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->getMessageBody(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;

    move-result-object v1

    .line 538
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 539
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/packet/Message$Body;

    .line 540
    invoke-virtual {v4, v1}, Lorg/jivesoftware/smack/packet/Message$Body;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 541
    invoke-static {v4}, Lorg/jivesoftware/smack/packet/Message$Body;->access$400(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    :cond_0
    goto :goto_0

    .line 544
    :cond_1
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getChannel()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->channel:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupVersion()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->groupVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getNotify()I
    .locals 1

    .line 112
    iget v0, p0, Lorg/jivesoftware/smack/packet/Message;->notify:I

    return v0
.end method

.method public getPreSeq()J
    .locals 2

    .line 162
    iget-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->preSeq:J

    return-wide v0
.end method

.method public getRefer()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->refer:Ljava/lang/String;

    return-object v0
.end method

.method public getSeq()J
    .locals 2

    .line 152
    iget-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->seq:J

    return-wide v0
.end method

.method public getSubject()Ljava/lang/String;
    .locals 1

    .line 301
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->getSubject(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSubject(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 313
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->getMessageSubject(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;

    move-result-object v1

    .line 314
    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$000(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getSubjectLanguages()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 398
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->getMessageSubject(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;

    move-result-object v1

    .line 399
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 400
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/packet/Message$Subject;

    .line 401
    invoke-virtual {v4, v1}, Lorg/jivesoftware/smack/packet/Message$Subject;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 402
    invoke-static {v4}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$100(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    :cond_0
    goto :goto_0

    .line 405
    :cond_1
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSubjects()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Lorg/jivesoftware/smack/packet/Message$Subject;>;"
        }
    .end annotation

    .line 334
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getThread()Ljava/lang/String;
    .locals 1

    .line 554
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    return-object v0
.end method

.method public getTs()J
    .locals 2

    .line 122
    iget-wide v0, p0, Lorg/jivesoftware/smack/packet/Message;->ts:J

    return-wide v0
.end method

.method public getType()Lorg/jivesoftware/smack/packet/Message$Type;
    .locals 1

    .line 275
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    if-nez v0, :cond_0

    .line 276
    sget-object v0, Lorg/jivesoftware/smack/packet/Message$Type;->normal:Lorg/jivesoftware/smack/packet/Message$Type;

    return-object v0

    .line 278
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    return-object v0
.end method

.method public isUnRead()Z
    .locals 1

    .line 172
    iget-boolean v0, p0, Lorg/jivesoftware/smack/packet/Message;->isUnRead:Z

    return v0
.end method

.method public removeBody(Ljava/lang/String;)Z
    .locals 3

    .line 510
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->determineLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 511
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/Message$Body;

    .line 512
    invoke-static {v2}, Lorg/jivesoftware/smack/packet/Message$Body;->access$400(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 513
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 515
    :cond_0
    goto :goto_0

    .line 516
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public removeBody(Lorg/jivesoftware/smack/packet/Message$Body;)Z
    .locals 1

    .line 527
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->bodies:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public removeSubject(Ljava/lang/String;)Z
    .locals 3

    .line 373
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Message;->determineLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 374
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/Message$Subject;

    .line 375
    invoke-static {v2}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$100(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 378
    :cond_0
    goto :goto_0

    .line 379
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public removeSubject(Lorg/jivesoftware/smack/packet/Message$Subject;)Z
    .locals 1

    .line 389
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->subjects:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public setBody(Ljava/lang/CharSequence;)V
    .locals 2

    .line 466
    if-eqz p1, :cond_0

    .line 467
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 469
    :cond_0
    const/4 v1, 0x0

    .line 471
    :goto_0
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/packet/Message;->setBody(Ljava/lang/String;)V

    .line 472
    return-void
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 1

    .line 480
    if-nez p1, :cond_0

    .line 481
    const-string v0, ""

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->removeBody(Ljava/lang/String;)Z

    .line 482
    return-void

    .line 484
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lorg/jivesoftware/smack/packet/Message;->addBody(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;

    .line 485
    return-void
.end method

.method public setChannel(Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message;->channel:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public setGroupVersion(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message;->groupVersion:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setNotify(I)V
    .locals 0

    .line 117
    iput p1, p0, Lorg/jivesoftware/smack/packet/Message;->notify:I

    .line 118
    return-void
.end method

.method public setPreSeq(J)V
    .locals 0

    .line 167
    iput-wide p1, p0, Lorg/jivesoftware/smack/packet/Message;->preSeq:J

    .line 168
    return-void
.end method

.method public setRefer(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message;->refer:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setSeq(J)V
    .locals 0

    .line 157
    iput-wide p1, p0, Lorg/jivesoftware/smack/packet/Message;->seq:J

    .line 158
    return-void
.end method

.method public setSubject(Ljava/lang/String;)V
    .locals 1

    .line 344
    if-nez p1, :cond_0

    .line 345
    const-string v0, ""

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->removeSubject(Ljava/lang/String;)Z

    .line 346
    return-void

    .line 348
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lorg/jivesoftware/smack/packet/Message;->addSubject(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;

    .line 349
    return-void
.end method

.method public setThread(Ljava/lang/String;)V
    .locals 0

    .line 564
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    .line 565
    return-void
.end method

.method public setTs(J)V
    .locals 0

    .line 127
    iput-wide p1, p0, Lorg/jivesoftware/smack/packet/Message;->ts:J

    .line 128
    return-void
.end method

.method public setType(Lorg/jivesoftware/smack/packet/Message$Type;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 288
    return-void
.end method

.method public setUnRead(Z)V
    .locals 0

    .line 177
    iput-boolean p1, p0, Lorg/jivesoftware/smack/packet/Message;->isUnRead:Z

    .line 178
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 587
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 588
    const-string v0, "Message Stanza ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Message;->logCommonAttributes(Ljava/lang/StringBuilder;)V

    .line 590
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    if-eqz v0, :cond_0

    .line 591
    const-string v0, "type="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 593
    :cond_0
    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 594
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 58
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 7

    .line 599
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 600
    const-string v0, "message"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 601
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Message;->addCommonAttributes(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 603
    const-string v0, "type"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 605
    const-string v0, "groupversion"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getGroupVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 607
    const-string v0, "channel"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getChannel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 609
    const-string v0, "refer"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getRefer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 612
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 615
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->getMessageSubject(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;

    move-result-object v3

    .line 616
    if-eqz v3, :cond_0

    .line 617
    const-string v0, "subject"

    invoke-static {v3}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$000(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 620
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getSubjects()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/packet/Message$Subject;

    .line 622
    invoke-virtual {v5, v3}, Lorg/jivesoftware/smack/packet/Message$Subject;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 623
    goto :goto_0

    .line 624
    :cond_1
    const-string v0, "subject"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-static {v5}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$100(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmllangAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 625
    invoke-static {v5}, Lorg/jivesoftware/smack/packet/Message$Subject;->access$000(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 626
    const-string v0, "subject"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 627
    goto :goto_0

    .line 629
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/Message;->getMessageBody(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;

    move-result-object v4

    .line 630
    if-eqz v4, :cond_3

    .line 631
    const-string v0, "body"

    invoke-static {v4}, Lorg/jivesoftware/smack/packet/Message$Body;->access$300(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 634
    :cond_3
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getBodies()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/jivesoftware/smack/packet/Message$Body;

    .line 636
    invoke-virtual {v6, v4}, Lorg/jivesoftware/smack/packet/Message$Body;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 637
    goto :goto_1

    .line 638
    :cond_4
    const-string v0, "body"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lorg/jivesoftware/smack/packet/Message$Body;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmllangAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 639
    invoke-virtual {v6}, Lorg/jivesoftware/smack/packet/Message$Body;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 640
    const-string v0, "body"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 641
    goto :goto_1

    .line 642
    :cond_5
    const-string v0, "thread"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Message;->thread:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 644
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message;->type:Lorg/jivesoftware/smack/packet/Message$Type;

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->error:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_6

    .line 645
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Message;->appendErrorIfExists(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 648
    :cond_6
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getExtensionsXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 649
    const-string v0, "message"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 650
    return-object v2
.end method
