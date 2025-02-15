package foundation.identity.did.representations;

import java.util.*;

public class RepresentationSpecificEntries {

    public static final List<String> JSONLD_REPRESENTATION_SPECIFIC_ENTRY_NAMES = Arrays.asList(
            "@context"
    );

    public static final List<String> JSON_REPRESENTATION_SPECIFIC_ENTRY_NAMES = Arrays.asList();

    public static final List<String> CBOR_REPRESENTATION_SPECIFIC_ENTRY_NAMES = Arrays.asList();

    public static final Map<String, List<String>> REPRESENTATION_SPECIFIC_ENTRY_NAMES = new HashMap<>();
    public static final List<String> ALL_REPRESENTATION_SPECIFIC_ENTRY_NAMES = new ArrayList<>();

    static {

        REPRESENTATION_SPECIFIC_ENTRY_NAMES.put(Representations.MEDIA_TYPE_JSONLD, JSONLD_REPRESENTATION_SPECIFIC_ENTRY_NAMES);
        REPRESENTATION_SPECIFIC_ENTRY_NAMES.put(Representations.MEDIA_TYPE_JSON, JSON_REPRESENTATION_SPECIFIC_ENTRY_NAMES);
        REPRESENTATION_SPECIFIC_ENTRY_NAMES.put(Representations.MEDIA_TYPE_CBOR, CBOR_REPRESENTATION_SPECIFIC_ENTRY_NAMES);

        for (Map.Entry<String, List<String>> entry : REPRESENTATION_SPECIFIC_ENTRY_NAMES.entrySet()) {
            ALL_REPRESENTATION_SPECIFIC_ENTRY_NAMES.addAll(entry.getValue());
        }
    }
}
