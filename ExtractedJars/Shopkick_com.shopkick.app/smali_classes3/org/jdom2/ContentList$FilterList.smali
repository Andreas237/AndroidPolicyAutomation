.class Lorg/jdom2/ContentList$FilterList;
.super Ljava/util/AbstractList;
.source "ContentList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/ContentList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "FilterList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Lorg/jdom2/Content;",
        ">",
        "Ljava/util/AbstractList<",
        "TF;>;"
    }
.end annotation


# instance fields
.field backingpos:[I

.field backingsize:I

.field final filter:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "TF;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/jdom2/ContentList;

.field xdata:I


# direct methods
.method constructor <init>(Lorg/jdom2/ContentList;Lorg/jdom2/filter/Filter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/filter/Filter<",
            "TF;>;)V"
        }
    .end annotation

    .line 940
    iput-object p1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 929
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    new-array p1, p1, [I

    iput-object p1, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    const/4 p1, 0x0

    .line 930
    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    const/4 p1, -0x1

    .line 932
    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    .line 941
    iput-object p2, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    return-void
.end method

.method static synthetic access$800(Lorg/jdom2/ContentList$FilterList;I)I
    .locals 0

    .line 923
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result p0

    return p0
.end method

.method private final fbinarySearch([IIILjava/util/Comparator;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([III",
            "Ljava/util/Comparator<",
            "-TF;>;)I"
        }
    .end annotation

    add-int/lit8 p2, p2, -0x1

    .line 1236
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    aget p3, v1, p3

    aget-object p3, v0, p3

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p2, :cond_3

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    .line 1239
    iget-object v2, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v2}, Lorg/jdom2/ContentList;->access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;

    move-result-object v2

    aget v3, p1, v1

    aget-object v2, v2, v3

    invoke-interface {p4, p3, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    if-nez v2, :cond_0

    if-ge v1, p2, :cond_0

    .line 1241
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;

    move-result-object v0

    add-int/lit8 v3, v1, 0x1

    aget v4, p1, v3

    aget-object v0, v0, v4

    invoke-interface {p4, p3, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    return v1

    :cond_1
    if-gez v2, :cond_2

    add-int/lit8 p2, v1, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method private final resync(I)I
    .locals 3

    .line 971
    iget v0, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    .line 974
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result v0

    iput v0, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    .line 975
    iput v2, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    .line 976
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v0

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 977
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    :cond_0
    if-ltz p1, :cond_1

    .line 981
    iget v0, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    if-ge p1, v0, :cond_1

    .line 984
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    aget p1, v0, p1

    return p1

    .line 989
    :cond_1
    iget v0, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    if-lez v0, :cond_2

    .line 990
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    add-int/lit8 v2, v0, 0x1

    .line 993
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 994
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Content;

    if-eqz v0, :cond_3

    .line 996
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    iget v1, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    aput v2, v0, v1

    add-int/lit8 v0, v1, 0x1

    .line 997
    iput v0, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    if-ne v1, p1, :cond_3

    return v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1003
    :cond_4
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result p1

    return p1
.end method


# virtual methods
.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 923
    check-cast p2, Lorg/jdom2/Content;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/ContentList$FilterList;->add(ILorg/jdom2/Content;)V

    return-void
.end method

.method public add(ILorg/jdom2/Content;)V
    .locals 2

    if-ltz p1, :cond_4

    .line 1022
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result v0

    .line 1023
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result v1

    if-gt p1, v1, :cond_0

    goto :goto_0

    .line 1024
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1026
    :cond_1
    :goto_0
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    invoke-interface {v1, p2}, Lorg/jdom2/filter/Filter;->matches(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1027
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0, p2}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    .line 1032
    iget-object p2, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    array-length p2, p2

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-gt p2, v1, :cond_2

    .line 1033
    iget-object p2, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    array-length v1, p2

    add-int/lit8 v1, v1, 0x1

    invoke-static {p2, v1}, Lorg/jdom2/internal/ArrayCopy;->copyOf([II)[I

    move-result-object p2

    iput-object p2, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    .line 1035
    :cond_2
    iget-object p2, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    aput v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    .line 1036
    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    .line 1037
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    return-void

    .line 1040
    :cond_3
    new-instance p1, Lorg/jdom2/IllegalAddException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Filter won\'t allow the "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' to be added to the list"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1020
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TF;>;)Z"
        }
    .end annotation

    if-eqz p2, :cond_9

    if-ltz p1, :cond_8

    .line 1057
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result v0

    .line 1058
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result v1

    if-gt p1, v1, :cond_0

    goto :goto_0

    .line 1059
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1062
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 1067
    :cond_2
    iget-object v3, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-virtual {v3}, Lorg/jdom2/ContentList;->size()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v3, v4}, Lorg/jdom2/ContentList;->ensureCapacity(I)V

    .line 1069
    iget-object v3, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v3}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result v3

    .line 1070
    iget-object v4, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v4}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result v4

    .line 1076
    :try_start_0
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/jdom2/Content;

    if-eqz v5, :cond_5

    .line 1081
    iget-object v6, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    invoke-interface {v6, v5}, Lorg/jdom2/filter/Filter;->matches(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 1082
    iget-object v6, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    add-int v7, v0, v2

    invoke-virtual {v6, v7, v5}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    .line 1088
    iget-object v5, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    array-length v5, v5

    iget-object v6, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v6}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v6

    if-gt v5, v6, :cond_3

    .line 1089
    iget-object v5, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    iget-object v6, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    array-length v6, v6

    add-int/2addr v6, v1

    invoke-static {v5, v6}, Lorg/jdom2/internal/ArrayCopy;->copyOf([II)[I

    move-result-object v5

    iput-object v5, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    .line 1091
    :cond_3
    iget-object v5, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    add-int v6, p1, v2

    aput v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    .line 1092
    iput v6, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    .line 1093
    iget-object v5, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v5}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result v5

    iput v5, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1097
    :cond_4
    new-instance p2, Lorg/jdom2/IllegalAddException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Filter won\'t allow the "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " \'"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\' to be added to the list"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1078
    :cond_5
    new-instance p2, Ljava/lang/NullPointerException;

    const-string v1, "Cannot add null content"

    invoke-direct {p2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    :goto_2
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_7

    .line 1108
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    add-int v5, v0, v2

    invoke-virtual {v1, v5}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    goto :goto_2

    .line 1111
    :cond_7
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0, v3, v4}, Lorg/jdom2/ContentList;->access$600(Lorg/jdom2/ContentList;II)V

    .line 1114
    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    .line 1115
    iput v3, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    throw p2

    .line 1054
    :cond_8
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1050
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot add a null collection"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 923
    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList$FilterList;->get(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Lorg/jdom2/Content;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TF;"
        }
    .end annotation

    if-ltz p1, :cond_1

    .line 1134
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result v0

    .line 1135
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1138
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Content;

    return-object p1

    .line 1136
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1132
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isEmpty()Z
    .locals 3

    const/4 v0, 0x0

    .line 957
    invoke-direct {p0, v0}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result v1

    iget-object v2, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v2}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TF;>;"
        }
    .end annotation

    .line 1143
    new-instance v0, Lorg/jdom2/ContentList$FilterListIterator;

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lorg/jdom2/ContentList$FilterListIterator;-><init>(Lorg/jdom2/ContentList;Lorg/jdom2/ContentList$FilterList;I)V

    return-object v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TF;>;"
        }
    .end annotation

    .line 1148
    new-instance v0, Lorg/jdom2/ContentList$FilterListIterator;

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lorg/jdom2/ContentList$FilterListIterator;-><init>(Lorg/jdom2/ContentList;Lorg/jdom2/ContentList$FilterList;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TF;>;"
        }
    .end annotation

    .line 1153
    new-instance v0, Lorg/jdom2/ContentList$FilterListIterator;

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-direct {v0, v1, p0, p1}, Lorg/jdom2/ContentList$FilterListIterator;-><init>(Lorg/jdom2/ContentList;Lorg/jdom2/ContentList$FilterList;I)V

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 923
    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList$FilterList;->remove(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public remove(I)Lorg/jdom2/Content;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TF;"
        }
    .end annotation

    if-ltz p1, :cond_1

    .line 1168
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result v0

    .line 1169
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1172
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-virtual {v1, v0}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    move-result-object v0

    .line 1174
    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    .line 1175
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    .line 1177
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    invoke-interface {p1, v0}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Content;

    return-object p1

    .line 1170
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1166
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 923
    check-cast p2, Lorg/jdom2/Content;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/ContentList$FilterList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public set(ILorg/jdom2/Content;)Lorg/jdom2/Content;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITF;)TF;"
        }
    .end annotation

    if-ltz p1, :cond_2

    .line 1195
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    move-result v0

    .line 1196
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 1199
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    invoke-interface {v1, p2}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    if-eqz v1, :cond_0

    .line 1201
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->filter:Lorg/jdom2/filter/Filter;

    iget-object p2, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-virtual {p2, v0, v1}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Content;

    .line 1203
    iget-object p2, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p2}, Lorg/jdom2/ContentList;->access$500(Lorg/jdom2/ContentList;)I

    move-result p2

    iput p2, p0, Lorg/jdom2/ContentList$FilterList;->xdata:I

    return-object p1

    .line 1206
    :cond_0
    new-instance v0, Lorg/jdom2/IllegalAddException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Filter won\'t allow index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " to be set to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1197
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1193
    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public size()I
    .locals 1

    const/4 v0, -0x1

    .line 1218
    invoke-direct {p0, v0}, Lorg/jdom2/ContentList$FilterList;->resync(I)I

    .line 1219
    iget v0, p0, Lorg/jdom2/ContentList$FilterList;->backingsize:I

    return v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TF;>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1271
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result v0

    .line 1272
    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 1274
    invoke-direct {p0, v1, v2, v2, p1}, Lorg/jdom2/ContentList$FilterList;->fbinarySearch([IIILjava/util/Comparator;)I

    move-result v3

    if-ge v3, v2, :cond_1

    add-int/lit8 v4, v3, 0x1

    sub-int v5, v2, v3

    .line 1276
    invoke-static {v1, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1278
    :cond_1
    iget-object v4, p0, Lorg/jdom2/ContentList$FilterList;->backingpos:[I

    aget v4, v4, v2

    aput v4, v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1280
    :cond_2
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterList;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1, v1}, Lorg/jdom2/ContentList;->access$700(Lorg/jdom2/ContentList;[I)V

    return-void
.end method
