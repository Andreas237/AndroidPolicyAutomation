.class public Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;
.super Ljava/lang/Object;
.source "ModuleFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/ModuleFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Menu_action"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final destructive:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final link:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final text:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x4

    .line 506
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 507
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "text"

    const-string v2, "text"

    .line 508
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "link"

    const-string v2, "link"

    .line 509
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "destructive"

    const-string v2, "destructive"

    .line 510
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forBoolean(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 528
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 529
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    .line 530
    iput-object p2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    .line 531
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    .line 532
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 536
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public destructive()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 548
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 581
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 582
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;

    .line 583
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    .line 584
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    .line 585
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    .line 586
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 593
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$hashCodeMemoized:Z

    if-nez v0, :cond_3

    .line 596
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 598
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 600
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 602
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    .line 603
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$hashCode:I

    const/4 v0, 0x1

    .line 604
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$hashCodeMemoized:Z

    .line 606
    :cond_3
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$hashCode:I

    return v0
.end method

.method public link()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 544
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 552
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action$1;-><init>(Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;)V

    return-object v0
.end method

.method public text()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 540
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 565
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 566
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Menu_action{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->link:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destructive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->destructive:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$toString:Ljava/lang/String;

    .line 573
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ModuleFragment$Menu_action;->$toString:Ljava/lang/String;

    return-object v0
.end method
